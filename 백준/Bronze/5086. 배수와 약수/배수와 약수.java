import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        while(true){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            if(a == 0 && b == 0){
                break;
            }
            int c = 0;
            if(a > b){
                c = a % b;
                if(c == 0){
                    sb.append("multiple").append('\n');
                }
            }else if(a <= b){
                c = b % a;
                if(c == 0){
                    sb.append("factor").append('\n');
                }
            }
            if(c != 0){
                sb.append("neither").append('\n');
            }

            c = 0;
        }

        System.out.println(sb);
    }
}
