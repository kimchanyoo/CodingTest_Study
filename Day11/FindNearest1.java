package Day11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class FindNearest1 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int idx = sc.nextInt();
		sc.nextLine();
		ArrayList<Integer> list = new ArrayList<Integer>();
		while(sc.hasNextInt()){
			list.add(sc.nextInt());
		}
		int listsize = list.size();
		int[] arr = new int[listsize];

		for(int i = 0; i < listsize; i++){
			arr[i] = list.get(i).intValue();
		}
		System.out.println(Arrays.toString(arr));
		int result = solution(arr, idx);

		System.out.println(result);
	}

	public static int solution(int[] arr, int idx) {
		int answer = -1;

		for(int i = idx; i < arr.length; i++){
			if(arr[i] == 1){
				answer = i;
				return answer;
			}
		}

		return answer;
	}
}
