package Day21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class FromTheBackToThe5thPlace {
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
		System.out.println(Arrays.toString(num_list));
		int[] result = solution(num_list);

		System.out.println(Arrays.toString(result));
	}

	public static int[] solution(int[] num_list) {
		int[] answer = new int[num_list.length - 5];
		Arrays.sort(num_list);

		for(int i = 5; i < num_list.length; i++){
			answer[i-5] = num_list[i];
		}

		return answer;
	}
}
