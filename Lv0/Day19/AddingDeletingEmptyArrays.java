package Day19;

import java.util.ArrayList;

public class AddingDeletingEmptyArrays {
	public int[] solution(int[] arr, boolean[] flag) {
		ArrayList<Integer> answerList = new ArrayList<>();

		for(int i = 0; i < arr.length; i++){
			if(flag[i]){
				for(int j = 0; j < arr[i] * 2; j++){
					answerList.add(arr[i]);
				}
			}else{
				for(int j = 0; j < arr[i]; j++){
					answerList.remove(answerList.size() - 1);
				}
			}
		}

		int[] answer = new int[answerList.size()];
		for(int i = 0; i < answer.length; i++){
			answer[i] = answerList.get(i);
		}

		return answer;
	}
}
