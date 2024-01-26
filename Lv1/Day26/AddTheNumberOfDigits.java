package Lv1.Day26;

import java.util.Scanner;

public class AddTheNumberOfDigits {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int result = solution(n);

		System.out.println(result);
	}
	public static int solution(int n) {
		int answer = 0;
		char[] nList = Integer.toString(n).toCharArray();

		for(int i = 0; i < nList.length; i++){
			answer += Integer.parseInt(String.valueOf(nList[i]));
		}

		return answer;
	}
}
