package Day12;

import java.util.ArrayList;

public class CreatingArray3 {
	public int[] solution(int[] arr, int[][] intervals) {
		ArrayList<Integer> answerList = new ArrayList<>();
		for(int i = 0; i < intervals.length; i++){
			for(int j = intervals[i][0]; j <= intervals[i][1]; j++){
				answerList.add(arr[j]);
			}
		}

		int[] answer = new int[answerList.size()];
		for(int i = 0; i < answer.length; i++){
			answer[i] = answerList.get(i);
		}

		return answer;
	}
}
