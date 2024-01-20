package Day20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PerformDifferentOperationsDependingOnTheLengthOfTheArray {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer> list = new ArrayList<Integer>();
		while(sc.hasNextInt()){
			list.add(sc.nextInt());
		}
		int listsize = list.size();
		int[] arr = new int[listsize];

		for(int i = 0; i < listsize; i++){
			arr[i] = list.get(i).intValue();
		}
		System.out.println(Arrays.toString(arr));
		int[] result = solution(arr, n);

		System.out.println(Arrays.toString(result));
	}

	public static int[] solution(int[] arr, int n) {
		int length = arr.length;
		int[] answer = new int[length];

		if(length % 2 == 0){
			for(int i = 0; i < length; i++){
				if(i % 2 == 0){
					answer[i] = arr[i];
				}else{
					answer[i] = arr[i] + n;
				}
			}
		}else{
			for(int i = 0; i < length; i++){
				if(i % 2 == 0){
					answer[i] = arr[i] + n;
				}else{
					answer[i] = arr[i];
				}
			}
		}

		return answer;
	}
}
