package Day11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CreatingArray1 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();

		int[] result = solution(n, k);

		System.out.println(Arrays.toString(result));
	}
	public static int[] solution(int n, int k) {
		ArrayList<Integer> answerList = new ArrayList<>();
		int number = k;
		while(n >= number){
			answerList.add(number);
			number += k;
		}

		int[] answer = new int[answerList.size()];
		for(int i = 0; i < answerList.size(); i++){
			answer[i] = answerList.get(i);
		}

		return answer;
	}
}
