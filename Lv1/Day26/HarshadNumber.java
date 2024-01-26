package Lv1.Day26;

import java.util.Scanner;

public class HarshadNumber {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();

		boolean result = solution(x);

		System.out.println(result);
	}
	public static boolean solution(int x) {
		boolean answer = false;
		char[] sList = Integer.toString(x).toCharArray();
		int n = 0;
		for (char c : sList) {
			n += Integer.parseInt(String.valueOf(c));
		}

		if(x % n ==0){
			answer = true;
		}

		return answer;
	}
}
