package Day4;

import java.util.Scanner;

public class ReturnDifferentValuesDependingOnOddNumber {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int result = solution(n);

		System.out.println(result);
	}

	public static int solution(int n) {
		int answer = 0;

		if(n % 2 != 0){
			for(int i = 1; i <= n; i = i + 2){
				answer += i;
			}
		}else{
			for(int i = 0; i <= n; i = i + 2){
				answer += i * i;
			}
		}

		return answer;
	}
}
