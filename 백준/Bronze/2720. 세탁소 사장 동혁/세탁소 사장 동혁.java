import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int[] change = {25, 10, 5, 1};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());
        int[][] result = new int[t][4];

        for(int i = 0; i < t; i++){
            int n = Integer.parseInt(br.readLine());
            int j = 0;
            while(n > 0){
                int a = n / change[j];

                result[i][j] = a;
                n %= change[j];
                j++;
            }
        }

        for(int i = 0; i < t; i++){
            for(int j = 0; j < 4; j++){
                sb.append(result[i][j] + " ");
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }
}
