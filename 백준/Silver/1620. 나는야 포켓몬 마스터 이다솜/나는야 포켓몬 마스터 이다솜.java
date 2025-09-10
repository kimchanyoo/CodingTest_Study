import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
        StringBuffer sb = new StringBuffer();

        int N = Integer.parseInt(stringTokenizer.nextToken());
        int M = Integer.parseInt(stringTokenizer.nextToken());

        HashMap<Integer, String> poketmon = new HashMap<>();
        HashMap<String, Integer> poketmon2 = new HashMap<>();

        for (int i = 0; i < N; i++) {
            String poketmonName = br.readLine();
            poketmon.put(i + 1, poketmonName);
            poketmon2.put(poketmonName, i + 1);
        }

        for (int i = 0; i < M; i++) {
            String s = br.readLine();
            if (s.charAt(0) >= '0' && s.charAt(0) <= '9') {
                int idx = Integer.parseInt(s);
                sb.append(poketmon.get(idx)).append('\n');
            } else {
                sb.append(poketmon2.get(s)).append('\n');
            }
        }

        System.out.println(sb);
    }
}
