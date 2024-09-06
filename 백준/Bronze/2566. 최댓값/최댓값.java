import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int[][] matrix = new int[9][9];
        int max = 0;
        int x = 0;
        int y = 0;
        for(int i = 0; i < 9; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < 9; j++){
                matrix[i][j] = Integer.parseInt(st.nextToken());
                if(matrix[i][j] >= max){
                    max = matrix[i][j];
                    x = i + 1;
                    y = j + 1;
                }
            }
        }

        sb.append(max).append("\n");
        sb.append(x).append(" ").append(y);

        System.out.println(sb);
    }
}
