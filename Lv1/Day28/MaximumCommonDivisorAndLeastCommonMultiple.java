package Lv1.Day28;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumCommonDivisorAndLeastCommonMultiple {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();

		int[] result = solution(n, m);

		System.out.println(Arrays.toString(result));
	}
	public static int gcd(int a, int b){
		while(b != 0){
			int r = a % b;
			a = b;
			b = r;
		}
		return a;
	}
	public static int lcm(int a, int b){
		return a * b / gcd(a, b);
	}
	public static int[] solution(int n, int m) {
		int[] answer = new int[2];
		answer[0] = gcd(n, m);
		answer[1] = lcm(n, m);

		return answer;
	}
}
