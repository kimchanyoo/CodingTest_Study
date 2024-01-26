package Day16;

import java.util.Scanner;

public class LowerCase {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String myString = sc.next();

		String result = solution(myString);

		System.out.println(result);
	}
	public static String solution(String myString) {
		return myString.toLowerCase();
	}
}
