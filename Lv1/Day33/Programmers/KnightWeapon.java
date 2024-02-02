package Lv1.Day33.Programmers;

import java.util.Scanner;

public class KnightWeapon {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int limit = sc.nextInt();
		int power = sc.nextInt();

		int result = solution(number, limit, power);
		System.out.println(result);
	}
	public static int solution(int number, int limit, int power) {
		int answer = 0;
		int divisors = 0;
		int num = 1;

		while(num <= number){
			for(int i = 1; i * i <= num; i++){
				if(i * i == num) divisors++;
				// 약수의 절반으로 갯수 알아내기
				else if(num % i == 0) divisors += 2;
			}
			if(divisors > limit){
				answer += power;
			}else{
				answer += divisors;
			}
			divisors = 0;
			num++;
		}

		return answer;
	}
}
