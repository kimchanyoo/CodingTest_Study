import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static StringBuilder answer;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str;
        while ((str = br.readLine()) != null) {
            answer = new StringBuilder();
            int n = Integer.parseInt(str);
            int len = (int) Math.pow(3, n);

            for (int i = 0; i < len; i++) {
                answer.append("-");
            }

            cantor(0, len);
            System.out.println(answer);
        }
    }
    public static void cantor(int index, int size){
        if(size == 1){
            return;
        }
        int tempSize = size / 3;

        for(int i = index + tempSize; i < index + 2 * tempSize; i++){
            answer.setCharAt(i, ' ');
        }

        cantor(index, tempSize);
        cantor(index + 2 * tempSize, tempSize);
    }
}
