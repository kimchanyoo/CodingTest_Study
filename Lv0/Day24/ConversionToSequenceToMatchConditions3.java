package Day24;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ConversionToSequenceToMatchConditions3 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
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
		int[] result = solution(arr, k);

		System.out.println(Arrays.toString(result));
	}

	public static int[] solution(int[] arr, int k) {
		int[] answer = new int[arr.length];

		for(int i = 0; i < arr.length; i++){
			if(k % 2 == 0){
				answer[i] = arr[i] + k;
			}else{
				answer[i] = arr[i] * k;
			}
		}

		return answer;
	}
}
