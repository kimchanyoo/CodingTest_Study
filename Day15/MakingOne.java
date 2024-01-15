package Day15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MakingOne {
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
		int answer = 0;

		for(int i = 0; i < num_list.length; i++){
			while(num_list[i] != 1){
				if(num_list[i] % 2 == 0){
					num_list[i] = num_list[i] / 2;
				}else{
					num_list[i] = (num_list[i] - 1) / 2;
				}
				answer++;
			}
		}

		return answer;
	}
}
