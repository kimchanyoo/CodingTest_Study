import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, -1, 0, 1};
    static boolean[][] visited;
    static int N, M;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        int[][] maze = new int[N][M];
        visited = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            String mazeLine = br.readLine();
            for (int j = 0; j < M; j++) {
                maze[i][j] = mazeLine.charAt(j) - '0';
            }
        }

        System.out.println(bfs(0, 0, maze));
    }

    public static int bfs(int x, int y, int[][] maze) {
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{x, y, 1});
        visited[x][y] = true;

        while (!q.isEmpty()) {
            int[] cur = q.poll();

            if (cur[0] == N - 1 && cur[1] == M - 1) {
                return cur[2];
            }

            for (int i = 0; i < 4; i++) {
                int nx = cur[0] + dx[i];
                int ny = cur[1] + dy[i];

                if (nx >= 0 && ny >= 0 && nx < N && ny < M) {
                    if (maze[nx][ny] == 1 && !visited[nx][ny]) {
                        visited[nx][ny] = true;
                        q.offer(new int[]{nx, ny, cur[2] + 1});
                    }
                }
            }
        }

        return -1;
    }
}
