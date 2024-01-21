package Day21;

import java.util.Scanner;

public class ConvertingAStringToAnInteger {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String n_str = sc.next();
		int result = solution(n_str);

		System.out.println(result);
	}
	public static int solution(String n_str) {
		int answer = Integer.parseInt(n_str);

		return answer;
	}
}
