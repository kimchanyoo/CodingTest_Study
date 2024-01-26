package Day4;

import java.util.Scanner;

public class CommonMultiple {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int n = sc.nextInt();
		int m = sc.nextInt();

		int result = solution(number, n, m);

		System.out.println(result);
	}

	public static int solution(int number, int n, int m) {
		int answer = 0;

		if(number % n == 0 && number % m == 0){
			answer = 1;
		}

		return answer;
	}
}
