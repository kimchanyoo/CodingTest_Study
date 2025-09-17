import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int N, M;
    static int[][] map;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static Queue<Coordinate> q = new LinkedList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());

        map = new int[N][M];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                if (map[i][j] == 1) {
                    q.offer(new Coordinate(i, j, 0));
                }
            }
        }

        bfs();
    }

    public static void bfs(){
        int day = 0;
        while(!q.isEmpty()){
            Coordinate c = q.poll();
            day = c.d;
            
            for(int i = 0; i < 4; i++){
                int nowX = c.x + dx[i];
                int nowY = c.y + dy[i];

                if(nowX >= 0 && nowY >= 0 && nowX < N && nowY < M){
                    if(map[nowX][nowY] == 0){
                        map[nowX][nowY] = 1;
                        q.add(new Coordinate(nowX, nowY, c.d + 1));
                    }
                }
            }
        }

        if(isRiped()){
            System.out.println(day);
        }else{
            System.out.println(-1);
        }
    }

    public static boolean isRiped(){
        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                if(map[i][j] == 0){
                    return false;
                }
            }
        }
        return true;
    }

    static class Coordinate{
        int x;
        int y;
        int d;
        public Coordinate(int x, int y, int d){
            this.x = x;
            this.y = y;
            this.d = d;
        }
    }
}
