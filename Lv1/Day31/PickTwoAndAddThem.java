package Lv1.Day31;

import java.util.*;

public class PickTwoAndAddThem {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> order = new ArrayList<>();
		while(sc.hasNextInt()){
			order.add(sc.nextInt());
		}
		int[] numbers = new int[order.size()];
		for(int i = 0; i < numbers.length; i++){
			numbers[i] = order.get(i);
		}

		int[] result = solution(numbers);

		System.out.println(Arrays.toString(result));
	}
	public static int[] solution(int[] numbers) {
		Set<Integer> sumList = new HashSet<>();

		for(int i = 0; i < numbers.length - 1; i++){
			for(int j = i + 1; j < numbers.length; j++){
				sumList.add(numbers[i] + numbers[j]);
			}
		}
		int[] answer = new int[sumList.size()];
		int idx = 0;

		for (int num : sumList){
			answer[idx++] = num;
		}

		Arrays.sort(answer);

		return answer;
	}
}
