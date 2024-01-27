package Lv1.Day27;

import java.util.Scanner;

public class GetTheMiddleLetter {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();

		String result = solution(s);

		System.out.println(result);
	}
	public static String solution(String s) {
		String answer = "";
		String middle = String.valueOf(s.charAt(s.length() / 2));
		if(s.length() % 2 != 0){
			answer = middle;
		}else{
			answer += String.valueOf(s.charAt(s.length() / 2 -1));
			answer += middle;
		}

		return answer;
	}
}
