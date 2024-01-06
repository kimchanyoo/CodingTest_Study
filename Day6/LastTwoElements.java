package Day6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class LastTwoElements {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		while(sc.hasNextInt()){
			list.add(sc.nextInt());
		}
		int listsize = list.size();
		int[] num_list = new int[listsize];

		for(int i = 0; i < listsize; i++){
			num_list[i] = list.get(i).intValue();
		}

		int[] result = solution(num_list);

		System.out.println(Arrays.toString(result));
	}

	public static int[] solution(int[] num_list) {
		int[] answer = new int[num_list.length + 1];
		int target_number = 0;
		int size = num_list.length;
		if(num_list[size-2] < num_list[size-1]){
			target_number = num_list[size-1] - num_list[size-2];
		}else{
			target_number = num_list[size-1] * 2;
		}

		for(int i = 0; i < size; i++){
			answer[i] = num_list[i];
		}

		answer[size] = target_number;

		return answer;
	}
}
