import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, -1, 0, 1};
    static boolean[][] visited;
    static int n;
    static int cnt;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        int[][] map = new int[n][n];
        visited = new boolean[n][n];

        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            for (int j = 0; j < n; j++) {
                map[i][j] = s.charAt(j) - '0';
            }
        }

        ArrayList<Integer> cntList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (map[i][j] == 1 && !visited[i][j]) {
                    cnt = 1;
                    dfs(i, j, map);
                    cntList.add(cnt);
                }
            }
        }

        Collections.sort(cntList);

        StringBuilder sb = new StringBuilder();

        sb.append(cntList.size()).append("\n");
        for (int i : cntList) {
            sb.append(i).append("\n");
        }

        System.out.println(sb);
    }

    public static void dfs(int x, int y, int[][] map) {
        visited[x][y] = true;

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx >= 0 && ny >= 0 && nx < n && ny < n) {
                if (!visited[nx][ny] && map[nx][ny] == 1) {
                    cnt++;
                    dfs(nx, ny, map);
                }
            }
        }
    }
}
