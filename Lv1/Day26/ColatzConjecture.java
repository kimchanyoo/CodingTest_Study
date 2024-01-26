package Lv1.Day26;

import java.util.Scanner;

public class ColatzConjecture {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long num = sc.nextInt();

		int result = solution(num);

		System.out.println(result);
	}
	public static int solution(long num) {
		int answer = 0;
		if(num == 1){
			return 0;
		}

		while (num != 1) {
			if (num % 2 == 0) {
				num = num / 2;
			} else {
				num = num * 3 + 1;
			}
			answer++;

			if(answer >= 500) {
				answer = -1;
				break;
			}
		}

		return answer;
	}
}
