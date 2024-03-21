package BackJoon.Day6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MinimumCommonMultiple {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		for(int i = 0; i < n; i++){
			st = new StringTokenizer(br.readLine(), " ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			sb.append(lcm(a,b)).append('\n');
		}
		System.out.println(sb);
	}
	private static int lcm(int a, int b){
		return (a * b) / gcd(a, b);
	}
	private static int gcd(int a, int b){
		int r = 0;
		while(b != 0){
			r = a % b;
			a = b;
			b = r;
		}
		return a;
	}
}
