package Day13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Reordering {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer> list = new ArrayList<Integer>();
		while(sc.hasNextInt()){
			list.add(sc.nextInt());
		}
		int listsize = list.size();
		int[] num_list = new int[listsize];

		for(int i = 0; i < listsize; i++){
			num_list[i] = list.get(i).intValue();
		}
		System.out.println(Arrays.toString(num_list));
		int[] result = solution(num_list, n);

		System.out.println(Arrays.toString(result));
	}

	public static int[] solution(int[] num_list, int n) {
		ArrayList<Integer> answerList = new ArrayList<>();

		for(int i = n; i < num_list.length; i++){
			answerList.add(num_list[i]);
		}
		for(int i = 0; i < n; i++){
			answerList.add(num_list[i]);
		}

		int[] answer = new int[answerList.size()];
		for(int i = 0; i < answer.length; i++){
			answer[i] = answerList.get(i);
		}

		return answer;
	}
}
