package Lv1.Day32;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class FruitVendor {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int m = sc.nextInt();
		ArrayList<Integer> order = new ArrayList<>();
		while(sc.hasNextInt()){
			order.add(sc.nextInt());
		}
		int[] score = new int[order.size()];
		for(int i = 0; i < score.length; i++){
			score[i] = order.get(i);
		}

		int result = solution(k, m, score);

		System.out.println(result);
	}
	public static int solution(int k, int m, int[] score) {
		int answer = 0;
		Arrays.sort(score);
		for(int i = score.length - m; i >= 0; i -= m)
			answer += score[i] * m;
		return answer;
	}
}
