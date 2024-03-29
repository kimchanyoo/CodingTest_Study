package BackJoon.Day10;

import java.io.*;

public class NQueen {
	static int[] chess;
	static int n;
	static int count = 0;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		chess = new int[n];

		findWays(0);

		System.out.println(count);
	}
	public static void findWays(int depth){
		if(depth == n){
			count++;
			return;
		}

		for(int i = 0; i < n; i++){
			chess[depth] = i;

			if(possibility(depth)){
				findWays(depth + 1);
			}
		}
	}
	public static boolean possibility(int col){
		for(int i = 0; i < col; i++){
			if(chess[col] == chess[i]){
				return false;
			}else if(Math.abs(col - i) == Math.abs(chess[col] - chess[i])){
				return false;
			}
		}

		return true;
	}
}
