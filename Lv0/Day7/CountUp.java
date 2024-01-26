package Day7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CountUp {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int start_num = sc.nextInt();
		int end_num = sc.nextInt();

		int[] result = solution(start_num, end_num);

		System.out.println(Arrays.toString(result));
	}
	public static int[] solution(int start_num, int end_num){
		ArrayList<Integer> answerList = new ArrayList<>();

		for(int i = start_num; i <= end_num; i++){
			answerList.add(i);
		}

		int[] answer = new int[answerList.size()];
		for(int j = 0; j < answerList.size(); j++){
			answer[j] = answerList.get(j);
		}

		return answer;
	}
}
