import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());
        long result = 0;

        for(int i = 1; i <= n - 2; i++){
            result += i * (n - 2 - (i - 1));
        }

        System.out.println(result);
        System.out.println(3);
    }
}
