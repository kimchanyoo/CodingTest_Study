package Day4;

import java.util.Scanner;

public class MultipleOfN {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int n = sc.nextInt();

		int result = solution(num, n);

		System.out.println(result);
	}

	public static int solution(int num, int n) {
		int answer = 0;

		if(num % n == 0){
			answer = 1;
		}

		return answer;
	}
}
