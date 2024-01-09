package Day9;

import java.util.Scanner;

public class NCharactersAfterString {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String my_string = sc.nextLine();
		int n = sc.nextInt();

		String result = solution(my_string, n);

		System.out.println(result);
	}
	public static String solution(String my_string, int n) {
		String answer = "";
		int length = my_string.length();
		answer = my_string.substring(length-n, length);

		return answer;
	}
}
