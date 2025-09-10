import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        HashSet<String> notListen = new HashSet<>();
        HashSet<String> notSee = new HashSet<>();

        for (int i = 0; i < N; i++) {
            notListen.add(br.readLine());
        }
        for (int i = 0; i < M; i++) {
            notSee.add(br.readLine());
        }

        ArrayList<String> result = new ArrayList<>();

        for (String s : notListen) {
            if (notSee.contains(s)) {
                result.add(s);
            }
        }

        Collections.sort(result);

        StringBuilder sb = new StringBuilder();
        sb.append(result.size());
        for (String s : result) {
            sb.append('\n');
            sb.append(s);
        }

        System.out.println(sb);
    }
}