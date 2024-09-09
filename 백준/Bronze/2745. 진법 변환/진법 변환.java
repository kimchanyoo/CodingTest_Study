import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String n = st.nextToken();
        int b = Integer.parseInt(st.nextToken());
        long result = 0;

        for(int i = 0; i < n.length(); i++) {
            int num = 0;
            if(n.charAt(i) - 48 > 10){
                num = Integer.parseInt(String.valueOf(n.charAt(i) - 65)) + 10;
            }else{
                num = Integer.parseInt(String.valueOf(n.charAt(i)));
            }
            result += (long) (Math.pow(b, n.length() - i - 1) * num);
        }

        System.out.println(result);
    }
}
