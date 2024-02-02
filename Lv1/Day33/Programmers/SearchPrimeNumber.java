package Lv1.Day33.Programmers;

import java.util.Scanner;

public class SearchPrimeNumber {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int result = solution(n);
		System.out.println(result);
	}
	public static int solution(int n) {
		int answer = 0;
		int num = 1;
		int cnt = 0;
		boolean[] primeList = new boolean[n];

		while(num <= n){
			if(!primeList[num - 1]){
				for(int i = 1; i * i <= num; i++){
					if(i * i == num) cnt++;
					else if(num % i == 0) cnt += 2;
				}
				if(cnt == 2){
					for(int i = 2; num * i < n; i++){
						primeList[num * i - 1] = true;
					}
					answer++;
				}
			}
			cnt = 0;
			num++;
		}

		return answer;
	}
}
