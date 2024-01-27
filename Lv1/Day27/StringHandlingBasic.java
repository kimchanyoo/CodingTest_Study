package Lv1.Day27;

import java.util.Scanner;

public class StringHandlingBasic {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();

		boolean result = solution(s);

		System.out.println(result);
	}
	public static boolean isInteger(String StringValue){
		try {
			Integer.parseInt(StringValue);
			return true;
		} catch (NumberFormatException ex) {
			return false;
		}
	}
	public static boolean solution(String s) {
		boolean answer = false;
		if(s.length() == 4 || s.length() == 6){
			answer = isInteger(s);
		}

		return answer;
	}
}
