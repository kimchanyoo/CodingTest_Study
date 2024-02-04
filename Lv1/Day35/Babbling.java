package Lv1.Day35;

import java.util.Scanner;

public class Babbling {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] babbling = new String[n];
		for(int i = 0; i < n; i++){
			babbling[i] = sc.next();
		}

		int result = solution(babbling);

		System.out.println(result);
	}
	public static int solution(String[] babbling) {
		int answer = 0;
		for(int i = 0; i < babbling.length; i++) {
			if(babbling[i].contains("ayaaya") || babbling[i].contains("yeye") || babbling[i].contains("woowoo") || babbling[i].contains("mama")) {
				continue;
			}

			babbling[i] = babbling[i].replace("aya", " ");
			babbling[i] = babbling[i].replace("ye", " ");
			babbling[i] = babbling[i].replace("woo", " ");
			babbling[i] = babbling[i].replace("ma", " ");
			babbling[i] = babbling[i].replace(" ", "");

			if(babbling[i].isEmpty()) answer++;

		}
		return answer;
	}
}