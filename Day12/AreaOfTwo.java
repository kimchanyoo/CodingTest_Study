package Day12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class AreaOfTwo {
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
		for (int i = 0; i < arr.length; i++) {
			answerList.add(arr[i]);
		}

		int twoCount = Collections.frequency(answerList, 2);
		ArrayList<Integer> result = new ArrayList<>();

		for (int i = 0; i < arr.length; i++) {
			if (answerList.get(i) == 2) {
				for (int j = i; j < arr.length; j++) {
					if (twoCount != 0) {
						result.add(answerList.get(j));
						if (answerList.get(j) == 2) {
							twoCount--;
						}
					}
				}
			}
			if (twoCount == 0) {
				break;
			}
		}
		if (result.size() == 0) {
			int[] answer = {-1};
			return answer;
		} else {
			int[] answer = new int[result.size()];

			for (int i = 0; i < answer.length; i++) {
				answer[i] = result.get(i);
			}
			return answer;
		}
	}
}
