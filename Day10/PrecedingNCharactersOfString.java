package Day10;

import java.util.Scanner;

public class PrecedingNCharactersOfString {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String my_string = sc.nextLine();
		int n = sc.nextInt();

		String result = solution(my_string, n);

		System.out.println(result);
	}
	public static String solution(String my_string, int n) {
		String answer = "";

		answer = my_string.substring(0, n);

		return answer;
	}
}
