package Day23;

import java.util.Scanner;

public class DiceGame {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int result = solution(a, b);

		System.out.println(result);
	}
	public static int solution(int a, int b) {
		int answer = 0;

		if(a % 2 == 0 && b % 2 == 0){
			answer = Math.abs(a-b);
		}else if( a % 2 != 0  && b % 2 != 0){
			answer = (int)Math.pow(a,2) + (int)Math.pow(b,2);
		}else{
			answer = 2 * (a + b);
		}

		return answer;
	}
}
