import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while(true){
            int n = Integer.parseInt(br.readLine());

            if(n == -1){
                break;
            }

            ArrayList<Integer> divisorList = new ArrayList<>();
            int sum = 0;

            for(int i = 1; i < n; i++){
                if(n % i == 0){
                    divisorList.add(i);
                    sum += i;
                }
            }

            if(sum == n){
                sb.append(n).append(" = ");
                for(int i = 0; i < divisorList.size() - 1; i++){
                    sb.append(divisorList.get(i)).append(" + ");
                }
                sb.append(divisorList.get(divisorList.size() - 1));
            }else{
                sb.append(n).append(" is NOT perfect.");
            }

            sb.append('\n');
        }

        System.out.println(sb);
    }
}
