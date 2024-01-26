package Day19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class AddAsManyElementsInArray {
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
		ArrayList<Integer> answerList = new ArrayList<>();

		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j < arr[i]; j++){
				answerList.add(arr[i]);
			}
		}

		int[] answer = new int[answerList.size()];
		for(int i = 0; i < answer.length; i++){
			answer[i] = answerList.get(i);
		}

		return answer;
	}
}
