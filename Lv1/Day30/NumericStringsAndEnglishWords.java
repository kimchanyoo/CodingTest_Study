package Lv1.Day30;

import java.util.Scanner;

public class NumericStringsAndEnglishWords {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();

		int result = solution(s);

		System.out.println(result);
	}
	public static int solution(String s) {
		String[] numberList = {"zero", "one", "two", "three", "four", "five",
				"six", "seven", "eight", "nine"};

		for(int i = 0; i < numberList.length; i++){
			if(s.contains(numberList[i])){
				s = s.replaceAll(numberList[i], String.valueOf(i));
			}
		}

		return Integer.parseInt(s);
	}
}
