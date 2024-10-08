import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        int[] line = new int[N - 1];
        for (int i = 0; i < N - 1; i++) {
            line[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        int[] station = new int[N];
        for (int i = 0; i < N; i++) {
            station[i] = Integer.parseInt(st.nextToken());
        }

        int min = station[0];
        long sum = 0;
        long length = 0;
        for (int i = 1; i < N; i++) {
            length += line[i - 1];
            if(station[i] < min){
               sum += min * length;
               min = station[i];
               length = 0;
            }
        }

        if(sum == 0){
            sum = min * length;
        }
        System.out.println(sum);
    }
}
