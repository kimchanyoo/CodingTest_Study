package Day15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ConversionOfSequenceToConditions1 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
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
		int[] result = solution(arr);

		System.out.println(Arrays.toString(result));
	}

	public static int[] solution(int[] arr) {
		for(int i = 0; i < arr.length; i++){
			if(arr[i] >= 50 && arr[i] % 2 == 0){
				arr[i] = arr[i] / 2;
			}else if(arr[i] < 50 && arr[i] % 2 != 0){
				arr[i] = arr[i] * 2;
			}
		}

		return arr;
	}
}
