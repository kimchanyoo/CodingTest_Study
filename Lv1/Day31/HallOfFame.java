package Lv1.Day31;

import java.util.*;

public class HallOfFame {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		ArrayList<Integer> order = new ArrayList<>();
		while(sc.hasNextInt()){
			order.add(sc.nextInt());
		}
		int[] score = new int[order.size()];
		for(int i = 0; i < score.length; i++){
			score[i] = order.get(i);
		}

		int[] result = solution(k, score);

		System.out.println(Arrays.toString(result));
	}
	public static int[] solution(int k, int[] score) {
		int[] answer = new int[score.length];
		List<Integer> rank = new ArrayList<>();

		for (int i = 0; i < score.length; i++) {
			rank.add(score[i]);
			if (rank.size() > k) {
				rank.remove(Collections.min(rank));
			}

			answer[i] = Collections.min(rank);
		}
		return answer;
	}
}
