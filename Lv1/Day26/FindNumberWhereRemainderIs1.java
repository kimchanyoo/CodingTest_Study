package Lv1.Day26;

import java.util.Scanner;

public class FindNumberWhereRemainderIs1 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int result = solution(n);

		System.out.println(result);
	}
	public static int solution(int n) {
		int answer = 0;

		for(int i = 1; i < n; i++){
			if(n % i == 1){
				answer = i;
				break;
			}
		}

		return answer;
	}
}
