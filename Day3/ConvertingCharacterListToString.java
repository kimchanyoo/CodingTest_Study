package Day3;

import java.util.Scanner;

public class ConvertingCharacterListToString {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String[] arr = str.split("");

		String result = solution(arr);

		System.out.println(result);

	}
	public static String solution(String[] arr) {
		String answer = "";

		answer = String.join("",arr);

		return answer;
	}

}
