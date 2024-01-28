package Lv1.Day28;

import java.util.Scanner;

public class TriadFlip {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int result = solution(n);

		System.out.println(result);
	}
	public static int solution(int n) {
		int answer = 0;
		String thirdFlip = Integer.toString(n, 3);
		char[] flipList = thirdFlip.toCharArray();
		thirdFlip = "";
		for(int i = flipList.length - 1; i >= 0; i--){
			thirdFlip += flipList[i];
		}
		answer = Integer.parseInt(thirdFlip, 3);

		return answer;
	}
}
