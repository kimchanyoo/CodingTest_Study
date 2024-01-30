package Lv1.Day30;

import java.util.Arrays;

public class KthNumber {
	public int[] solution(int[] array, int[][] commands) {
		int[] answer = new int[commands.length];

		for(int i = 0; i < commands.length; i++){
			int start = commands[i][0];
			int end = commands[i][1];
			int target = commands[i][2];
			int listSize = end - start + 1;
			int[] numberList = new int[listSize];
			for(int j = 0; j < listSize; j++){
				numberList[j] = array[start - 1];
				start++;
			}
			Arrays.sort(numberList);
			answer[i] = numberList[target - 1];
		}

		return answer;
	}
}
