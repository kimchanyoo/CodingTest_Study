package Day12;

import java.util.ArrayList;

public class CutList {
	public int[] solution(int n, int[] slicer, int[] num_list) {
		ArrayList<Integer> answerList = new ArrayList<>();

		if(n == 1){
			for(int i = 0; i <= slicer[1]; i++){
				answerList.add(num_list[i]);
			}
		}else if(n == 2){
			for(int i = slicer[0]; i < num_list.length; i++){
				answerList.add(num_list[i]);
			}
		}else if(n == 3){
			for(int i = slicer[0]; i <= slicer[1]; i++){
				answerList.add(num_list[i]);
			}
		}else if(n == 4){
			for(int i = slicer[0]; i <= slicer[1]; i = i + slicer[2]){
				answerList.add(num_list[i]);
			}
		}
		int[] answer = new int[answerList.size()];
		for(int i = 0; i < answer.length; i++){
			answer[i] = answerList.get(i);
		}


		return answer;
	}
}
