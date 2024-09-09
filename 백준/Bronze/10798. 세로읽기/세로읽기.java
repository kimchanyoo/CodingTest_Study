import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[][] matrix = new String[15][15];

        for (String[] strings : matrix) {
            Arrays.fill(strings, "-1");
        }

        for(int i = 0; i < 5; i++){
            String input = br.readLine();
            for(int j = 0; j < input.length(); j++){
                matrix[i][j] = input.charAt(j) + "";
            }

        }

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                if(!matrix[j][i].equals("-1")){
                    sb.append(matrix[j][i]);
                }
            }
        }


        System.out.println(sb);
    }
}
