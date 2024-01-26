package Day7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ColatzSequence {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[] result = solution(n);

		System.out.println(Arrays.toString(result));
	}
	public static int[] solution(int n){
		ArrayList<Integer> answerList = new ArrayList<>();
		answerList.add(n);

		while(n > 1){
			if(n % 2 == 0){
				n = n /2;
				answerList.add(n);
			}else{
				n = 3 * n + 1;
				answerList.add(n);
			}
		}

		int[] answer = new int[answerList.size()];
		for(int j = 0; j < answerList.size(); j++){
			answer[j] = answerList.get(j);
		}

		return answer;
	}
}
