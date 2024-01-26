package Day20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MakeLengthOfArrayPowerOf2 {
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
		int length = arr.length;
		ArrayList<Integer> answerList = new ArrayList<>();

		if(length == 1){
			return arr;
		}else{
			for (int j : arr) {
				answerList.add(j);
			}
			int power = 2;
			while(power < length){
				power = power * 2;
			}
			if(power == length){
				return arr;
			}else{
				for(int i = length; i < power; i++){
					answerList.add(0);
				}
			}
		}
		int[] answer = new int[answerList.size()];
		for(int i = 0; i < answerList.size(); i++){
			answer[i] = answerList.get(i);
		}

		return answer;
	}
}
