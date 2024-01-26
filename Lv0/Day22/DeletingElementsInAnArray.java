package Day22;

import java.util.ArrayList;

public class DeletingElementsInAnArray {
	public int[] solution(int[] arr, int[] delete_list) {
		ArrayList<Integer> answerList = new ArrayList<>();
		for (int k : arr) {
			answerList.add(k);
		}

		for (int k : arr) {
			for (int i : delete_list) {
				if (k == i) {
					// Integer형인데 int형 삭제를 하려고 해서 오류 발생
					answerList.remove(Integer.valueOf(k));
					break;
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
