package Day3;

import java.util.Scanner;

public class StringMultiplication {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String my_string = sc.next();
		int k = sc.nextInt();

		String result = solution(my_string, k);

		System.out.println(result);
	}
	public static String solution(String my_string, int k)  {
		String answer = "";

		answer = my_string.repeat(k);

		return answer;
	}
}
