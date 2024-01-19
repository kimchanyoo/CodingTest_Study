package Day19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class RandomNumberOfKNumbers {
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
		int[] answer = new int[k];
		int[] kArr = Arrays.stream(arr).distinct().toArray();
		int len = kArr.length;
		for(int i =0; i<answer.length; i++) {
			if(len != 0) {
				len --;
				answer[i] = kArr[i];
			}else {
				answer[i] = -1;
			}
		}
		return answer;
	}
}
