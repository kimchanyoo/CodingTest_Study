package BackJoon.Day8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Divisor {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] numList = new int[n];
		StringTokenizer st =  new StringTokenizer(br.readLine(), " ");
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < n; i++){
			int num = Integer.parseInt(st.nextToken());
			numList[i] = num;
			min = Math.min(min, num);
			max = Math.max(max, num);
		}

		System.out.println(min * max);
	}
}
