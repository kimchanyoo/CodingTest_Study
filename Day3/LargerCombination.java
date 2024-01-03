package Day3;

import java.util.Scanner;

public class LargerCombination {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		int result = solution(a, b);

		System.out.println(result);
	}
	public static int solution(int a, int b) {
		int answer = 0;

		String temp1 = Integer.toString(a);
		String temp2 = Integer.toString(b);
		String result1 = temp1 + temp2;
		String result2 = temp2 + temp1;

		answer = Math.max(Integer.parseInt(result1), Integer.parseInt(result2));

		return answer;
	}
}
