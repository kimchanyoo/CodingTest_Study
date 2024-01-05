package Day5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ProductAndSumOfElements {
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

		int result = solution(num_list);

		System.out.println(result);
	}

	public static int solution(int[] num_list) {
		int answer = 0;

		int multiple = 1;
		int sum = Arrays.stream(num_list).sum();
		int squareOfSum = sum * sum;

		for(int i = 0; i < num_list.length; i++){
			multiple = multiple * num_list[i];
		}

		if(multiple < squareOfSum){
			answer = 1;
		}

		return answer;
	}
}
