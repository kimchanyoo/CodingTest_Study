package Lv1.Day26;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class EliminatingTheSmallestNumber {
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
		if(arr.length == 1){
			return new int[]{-1};
		}
		ArrayList<Integer> arrList = new ArrayList<>();
		int minValue = Arrays.stream(arr).min().getAsInt();

		for(int i : arr){
			if(i != minValue){
				arrList.add(i);
			}
		}
		int[] answer = new int[arrList.size()];
		for(int i = 0; i < answer.length; i++){
			answer[i] = arrList.get(i);
		}

		return answer;
	}
}
