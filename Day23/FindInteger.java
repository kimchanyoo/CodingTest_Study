package Day23;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class FindInteger {
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
		int result = solution(num_list, n);

		System.out.println(result);
	}

	public static int solution(int[] num_list, int n) {
		for(int i : num_list){
			if(i == n){
				return 1;
			}
		}

		return 0;
	}
}
