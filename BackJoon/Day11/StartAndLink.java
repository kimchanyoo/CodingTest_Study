package BackJoon.Day11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class StartAndLink {
	static int n;
	static int[][] ability;
	static boolean[] visit;
	static int min = Integer.MAX_VALUE;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		StringTokenizer st;
		ability = new int[n][n];
		visit = new boolean[n];

		for(int i = 0; i < n; i++){
			st = new StringTokenizer(br.readLine(), " ");
			for(int j = 0; j < n; j++){
				ability[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		combi(0, 0);
		System.out.println(min);
	}
	public static void combi(int idx, int depth){
		if(depth == n / 2){
			diff();
			return;
		}

		for(int i = idx; i < n; i++){
			if(!visit[i]){
				visit[i] = true;
				combi(i + 1, depth + 1);
				visit[i] = false;
			}
		}
	}
	public static void diff(){
		int team_start = 0;
		int team_link = 0;

		for(int i = 0; i < n; i++){
			for(int j = i + 1; j < n; j++){
				if(visit[i] && visit[j]){
					team_start += ability[i][j];
					team_start += ability[j][i];
				}else if(!visit[i] && !visit[j]){
					team_link += ability[i][j];
					team_link += ability[j][i];
				}
			}
		}

		int val = Math.abs(team_start - team_link);

		if(val == 0){
			System.out.println(val);
			System.exit(0);
		}

		min = Math.min(min, val);
	}
}
