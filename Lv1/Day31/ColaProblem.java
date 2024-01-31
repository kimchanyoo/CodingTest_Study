package Lv1.Day31;

import java.util.Scanner;

public class ColaProblem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int n = sc.nextInt();

		int result = solution(a, b, n);

		System.out.println(result);
	}
	public static int solution(int a, int b, int n) {
		int answer = 0;
		int times = 0;
		int refill = 0;
		while(n >= a){
			times = n / a;
			refill = b * times;
			answer += refill;
			n = (n - (times * a)) + refill;
		}

		return answer;
	}
}
