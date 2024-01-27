package Lv1.Day27;

import java.util.Scanner;

public class NumberAndAdditionOfDivisors {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int left = sc.nextInt();
		int right = sc.nextInt();

		int result = solution(left, right);

		System.out.println(result);
	}
	public static int solution(int left, int right) {
		int num = left;
		int answer = 0;

		while(num <= right){
			int divisor = 0;
			for(int i = 1; i <= num; i++){
				if(num % i == 0){
					divisor++;
				}
			}
			if(divisor % 2 == 0){
				answer += num;
			}else{
				answer -= num;
			}
			num++;
		}

		return answer;
	}
}
