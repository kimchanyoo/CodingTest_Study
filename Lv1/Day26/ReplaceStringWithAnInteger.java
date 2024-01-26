package Lv1.Day26;

import java.util.Scanner;

public class ReplaceStringWithAnInteger {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();

		int result = solution(s);

		System.out.println(result);
	}
	public static int solution(String s) {
		return Integer.parseInt(s);
	}
}
