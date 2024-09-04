import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int div = n / 4 - 1;

        for(int i = 0; i < div; i++){
            sb.append("long ");
        }
        sb.append("long int");
        System.out.println(sb.toString());
    }
}