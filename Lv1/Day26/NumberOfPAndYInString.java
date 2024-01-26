package Lv1.Day26;

import java.util.Scanner;

public class NumberOfPAndYInString {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();

		boolean result = solution(s);

		System.out.println(result);
	}
	public static boolean solution(String s) {
		boolean answer = true;
		s = s.toLowerCase();

		if(s.contains("p") || s.contains("y")){
			int pNumber = (int) s.chars()
					.filter(c -> c == 'p')
					.count();
			int yNumber = (int) s.chars()
					.filter(c -> c == 'y')
					.count();
			if(pNumber != yNumber){
				answer = false;
			}
		}

		return answer;
	}
}
