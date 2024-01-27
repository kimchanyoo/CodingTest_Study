package Lv1.Day27;

import java.util.Scanner;

public class CalculatingTheInsufficientAmount {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int price = sc.nextInt();
		int money = sc.nextInt();
		int count = sc.nextInt();

		long result = solution(price, money, count);

		System.out.println(result);
	}
	public static long solution(int price, long money, int count) {
		long answer = 0;
		long tempPrice = price;
		for(int i = 0; i < count; i++){
			answer += tempPrice;
			tempPrice += price;
		}

		if(answer > money){
			answer = answer - money;
		}else{
			answer = 0;
		}

		return answer;
	}
}
