package Day15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class OperationAccordingToLength {
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
		int result = solution(num_list);

		System.out.println(result);
	}

	public static int solution(int[] num_list) {
		int answer = 1;

		if(num_list.length >= 11){
			for(int n : num_list){
				answer += n;
			}
			answer = answer - 1;
		}else{
			for(int n : num_list){
				answer = answer * n;
			}
		}

		return answer;
	}
}
