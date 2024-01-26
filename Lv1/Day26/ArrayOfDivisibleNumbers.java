package Lv1.Day26;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ArrayOfDivisibleNumbers {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int divisor = sc.nextInt();
		ArrayList<Integer> order = new ArrayList<>();
		while(sc.hasNextInt()){
			order.add(sc.nextInt());
		}
		int[] arr = new int[order.size()];
		for(int i = 0; i < arr.length; i++){
			arr[i] = order.get(i);
		}

		int[] result = solution(arr, divisor);

		System.out.println(Arrays.toString(result));
	}
	public static int[] solution(int[] arr, int divisor) {
		ArrayList<Integer> arrList = new ArrayList<>();
		for(int i : arr){
			if(i % divisor == 0){
				arrList.add(i);
			}
		}
		Collections.sort(arrList);

		int[] answer = new int[arrList.size()];
		if(arrList.isEmpty()){
			return new int[]{-1};
		}else{
			for(int i = 0; i < answer.length; i++){
				answer[i] = arrList.get(i);
			}
		}

		return answer;
	}
}
