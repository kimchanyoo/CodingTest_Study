package Lv1.Day26;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class FindTheMean {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> order = new ArrayList<>();
		while(sc.hasNextInt()){
			order.add(sc.nextInt());
		}
		int[] arr = new int[order.size()];
		for(int i = 0; i < arr.length; i++){
			arr[i] = order.get(i);
		}

		double result = solution(arr);

		System.out.println(result);
	}
	public static double solution(int[] arr) {
		double answer = 0;

		int sum = Arrays.stream(arr).sum();

		answer = (double) sum / arr.length;

		return answer;
	}
}
