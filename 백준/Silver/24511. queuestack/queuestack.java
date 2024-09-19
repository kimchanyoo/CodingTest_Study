import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    static LinkedList<Integer> queue = new LinkedList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        boolean[] isStructure = new boolean[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            if(Integer.parseInt(st.nextToken()) == 0){
                isStructure[i] = true;
            }
        }

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++){
            int num = Integer.parseInt(st.nextToken());
            if(isStructure[i]){
                queue.offer(num);
            }
        }

        int m = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < m; i++){
            int num = Integer.parseInt(st.nextToken());
            sb.append(calculate(num, isStructure)).append(" ");
        }

        System.out.println(sb);
    }

    public static int calculate(int num, boolean[] isStructure){
        queue.addFirst(num);
        return queue.pollLast();
    }
}
