package Day19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MakingList6 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
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
		int[] result = solution(arr);

		System.out.println(Arrays.toString(result));
	}

	public static int[] solution(int[] arr) {
		ArrayList<Integer> answerList = new ArrayList<>();
		int i = 0;

		for(int j = 0; j < arr.length; j++){
			if(i < arr.length){
				if(answerList.size() == 0){
					answerList.add(arr[j]);
					i++;
				}else if(answerList.size() != 0 && answerList.get(answerList.size() -1) == arr[j]){
					answerList.remove(answerList.size() -1);
					i++;
				}else if(answerList.size() != 0 && answerList.get(answerList.size() -1) != arr[j]){
					answerList.add(arr[j]);
					i++;
				}
			}
		}

		if(answerList.size() == 0){
			int[] stk = {-1};
			return stk;
		}
		int[] stk = new int[answerList.size()];
		for(int j = 0; j < stk.length; j++) {
			stk[j] = answerList.get(j);
		}

		return stk;
	}
}
