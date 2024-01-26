package Lv1.Day26;

import java.util.Scanner;

public class DeterminingSquareRootOfInteger {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();

		long result = solution(n);

		System.out.println(result);
	}
	public static long solution(long n) {
		long answer = 0;
		long number = (long)Math.sqrt((double)n);
		if(number * number == n){
			answer = (long) Math.pow(number + 1, 2);
		}else{
			answer = -1;
		}

		return answer;
	}
}
