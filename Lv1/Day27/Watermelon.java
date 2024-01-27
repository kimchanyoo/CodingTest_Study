package Lv1.Day27;

import java.util.Scanner;

public class Watermelon {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		String result = solution(n);

		System.out.println(result);
	}
	public static String solution(int n) {
		String answer = "";

		for(int i = 0; i < n; i++){
			if(i % 2 == 0){
				answer += "수";
			}else{
				answer += "박";
			}
		}

		return answer;
	}
}
