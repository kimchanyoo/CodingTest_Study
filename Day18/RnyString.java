package Day18;

import java.util.Scanner;

public class RnyString {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String rny_string = sc.next();

		String result = solution(rny_string);

		System.out.println(result);
	}
	public static String solution(String rny_string) {
		String answer = "";

		answer = rny_string.replace("m", "rn");

		return answer;
	}
}
