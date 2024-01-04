package Day4;

import java.util.Scanner;

public class ReturnDifferentValuesDependingOnFlag {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		boolean flag = sc.nextBoolean();

		int result = solution(a, b, flag);

		System.out.println(result);
	}

	public static int solution(int a, int b, boolean flag) {
		int answer = 0;

		if(flag){
			answer = a + b;
		}else{
			answer = a - b;
		}

		return answer;
	}
}
