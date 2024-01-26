package Lv1.Day26;

import java.util.Scanner;

public class SumOfTwoIntegers {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		long result = solution(a, b);

		System.out.println(result);
	}
	public static long solution(int a, int b) {
		long answer = 0;
		if(a < b){
			for(int i = a; i <= b; i++){
				answer += i;
			}
		}else if(a > b){
			for(int i = b; i <= a; i++){
				answer += i;
			}
		}else{
			answer = a;
		}


		return answer;
	}
}
