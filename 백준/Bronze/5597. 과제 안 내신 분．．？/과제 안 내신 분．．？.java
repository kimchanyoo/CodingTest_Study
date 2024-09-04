import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        boolean[] AttendanceBook = new boolean[30];

        for(int i = 0; i < 28; i++){
            int attendance = Integer.parseInt(br.readLine());
            AttendanceBook[attendance - 1] = true;
        }

        for(int i = 0; i < 30; i++){
            if(!AttendanceBook[i]){
                sb.append(i + 1).append('\n');
            }
        }

        System.out.println(sb);
    }
}
