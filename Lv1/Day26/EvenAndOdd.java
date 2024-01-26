package Lv1.Day26;

import java.util.Scanner;

public class EvenAndOdd {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		String result = solution(num);

		System.out.println(result);
	}
	public static String solution(int num) {
		String answer = "";

		if(num % 2 == 0){
			answer = "Even";
		}else{
			answer = "Odd";
		}

		return answer;
	}
}
