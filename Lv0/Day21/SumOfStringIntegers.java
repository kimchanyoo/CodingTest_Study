package Day21;

import java.util.Scanner;

public class SumOfStringIntegers {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String num_str = sc.next();
		int result = solution(num_str);

		System.out.println(result);
	}
	public static int solution(String num_str) {
		int answer = 0;

		char[] numList = num_str.toCharArray();
		for(char i : numList){
			answer += Integer.parseInt(String.valueOf(i));
		}

		return answer;
	}
}
