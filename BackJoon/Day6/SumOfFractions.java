package BackJoon.Day6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SumOfFractions {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int a1 = Integer.parseInt(st.nextToken());
		int b1 = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine(), " ");
		int a2 = Integer.parseInt(st.nextToken());
		int b2 = Integer.parseInt(st.nextToken());

		int a = a1 * b2 + a2 * b1;
		int b = b1 * b2;

		int div = gcd(a, b);
		a = a / div;
		b = b / div;

		System.out.println(a + " " + b);
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
