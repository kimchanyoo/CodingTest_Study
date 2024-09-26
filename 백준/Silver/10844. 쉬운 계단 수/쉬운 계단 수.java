import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    
    final static long mod = 1000000000;
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        long[] dp = new long[10];
        long[] temp = new long[10];

        for(int i = 1; i < 10; i++){
            dp[i] = 1;
        }

        for(int i = 1; i < n; i++){
            System.arraycopy(dp, 0, temp, 0, 10);
            for(int j = 1; j < 9; j++){
                dp[j] = (temp[j - 1] + temp[j + 1]) % mod;
            }
            dp[0] = temp[1] % mod;
            dp[9] = temp[8] % mod;
        }

        long sum = 0;
        for(int i = 0; i < 10; i++){
            sum += dp[i];
        }

        System.out.println(sum % mod);
    }

}
