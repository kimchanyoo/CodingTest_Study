package Day22;

import java.util.Scanner;

public class ConvertingToString {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String result = solution(n);

		System.out.println(result);
	}
	public static String solution(int n) {
		String answer = String.valueOf(n);

		return answer;
	}
}
