import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        Comparator<String> cmp = (a, b) -> {
            int d = a.length() - b.length();
            return (d != 0) ? d : a.compareTo(b);
        };

        // 정렬 + 중복제거 동시
        Set<String> set = new TreeSet<>(cmp);
        for (int i = 0; i < N; i++) set.add(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (String s : set) sb.append(s).append('\n');
        System.out.print(sb);
    }
}
