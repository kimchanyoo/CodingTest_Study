import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    final static long P = 1000000007;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long N = Long.parseLong(st.nextToken());
        long K = Long.parseLong(st.nextToken());

        long numer = factorial(N);

        long denom = factorial(K) * factorial(N - K) % P;

        System.out.println(numer * pow(denom, P - 2) % P);
    }

    public static long factorial(long N) {
        long fac = 1L;

        while(N > 1) {
            fac = (fac * N) % P;
            N--;
        }
        return fac;
    }

    public static long pow(long base, long expo) {

        if(expo == 1) {
            return base % P;
        }

        long temp = pow(base, expo / 2);

        if(expo % 2 == 1) {
            return (temp * temp % P) * base % P;
        }
        return temp * temp % P;

    }

}
