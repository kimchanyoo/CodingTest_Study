package Lv1.Day28;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class DislikeTheSameNumber {
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

		int[] result = solution(arr);

		System.out.println(Arrays.toString(result));
	}
	public static int[] solution(int[] arr) {
		ArrayList<Integer> answerList = new ArrayList<>();
		int value = -1;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] != value) {
				answerList.add(arr[i]);
				value = arr[i];
			}
		}
		return answerList.stream().mapToInt(i->i).toArray();
	}
}
