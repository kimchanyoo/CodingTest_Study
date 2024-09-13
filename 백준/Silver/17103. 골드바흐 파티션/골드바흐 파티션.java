import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());

        boolean[] prime = new boolean[1000001];

        prime[0] = prime[1] = true;

        for(int i = 2; i <= Math.sqrt(prime.length); i++) {
            if(!prime[i]) {
                for (int j = i * i; j < prime.length; j += i) {
                    prime[j] = true;
                }
            }
        }

        for(int i = 0; i < t; i++){
            int n = Integer.parseInt(br.readLine());
            int ans = 0;

            for(int j = 2; j <= n / 2; j++){
                if(!prime[j] && !prime[n - j]){
                    ans++;
                }
            }
            sb.append(ans).append('\n');
        }

        System.out.println(sb);
    }
}
