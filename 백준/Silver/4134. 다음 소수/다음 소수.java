import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());

        for(int i = 0; i < t; i++){
            long n = Long.parseLong(br.readLine());

            if(n == 0 || n == 1){
                sb.append(2).append('\n');
                continue;
            }

            while(true){
                long num = 0;
                for(int j = 2; j <= Math.sqrt(n); j++){
                    if(n % j == 0){
                        num++;
                        break;
                    }
                }

                if(num == 0){
                    sb.append(n).append('\n');
                    break;
                }
                n++;
            }
        }

        System.out.println(sb);
    }
}
