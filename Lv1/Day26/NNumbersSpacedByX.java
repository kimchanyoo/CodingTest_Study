package Lv1.Day26;

import java.util.Arrays;
import java.util.Scanner;

public class NNumbersSpacedByX {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int n = sc.nextInt();

		long[] result = solution(x, n);

		System.out.println(Arrays.toString(result));
	}
	public static long[] solution(int x, int n) {
		long[] answer = new long[n];
		long number = x;
		for(int i = 0; i < n; i++){
			answer[i] = number;
			number += x;
		}

		return answer;
	}
}
