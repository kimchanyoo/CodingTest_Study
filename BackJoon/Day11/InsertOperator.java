package BackJoon.Day11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class InsertOperator {
	static int n;
	static int[] numList;
	static int[] operator;
	static int max = Integer.MIN_VALUE;
	static int min = Integer.MAX_VALUE;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		numList = new int[n];

		for(int i = 0; i < n; i++){
			numList[i] = Integer.parseInt(st.nextToken());
		}

		operator = new int[4];
		st = new StringTokenizer(br.readLine(), " ");

		for(int i = 0; i < 4; i++){
			operator[i] = Integer.parseInt(st.nextToken());
		}

		dfs(numList[0], 1);

		System.out.println(max);
		System.out.println(min);
	}
	public static void dfs(int num, int depth){
		if(depth == n){
			max = Math.max(max, num);
			min = Math.min(min, num);
			return;
		}

		for(int i = 0; i < 4; i++){
			if(operator[i] > 0){
				operator[i]--;

				switch (i){
					case 0:
						dfs(num + numList[depth], depth + 1);
						break;
					case 1:
						dfs(num - numList[depth], depth + 1);
						break;
					case 2:
						dfs(num * numList[depth], depth + 1);
						break;
					case 3:
						dfs(num / numList[depth], depth + 1);
						break;
				}

				operator[i]++;
			}
		}
	}
}
