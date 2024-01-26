package Day7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CreatingArray4 {
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

		int[] result = solution(arr);

		System.out.println(Arrays.toString(result));
	}
	public static int[] solution(int[] arr){
		ArrayList<Integer> answerList = new ArrayList<>();

		for(int i = 0; i < arr.length;){
			if(answerList.isEmpty()){
				answerList.add(arr[i]);
				i++;
			}else if(!answerList.isEmpty()){
				if(answerList.get(answerList.size() - 1) < arr[i]){
					answerList.add(arr[i]);
					i++;
				}else{
					answerList.remove(answerList.size() -1);
				}
			}
		}

		int[] stk = new int[answerList.size()];
		for(int j = 0; j < answerList.size(); j++){
			stk[j] = answerList.get(j);
		}

		return stk;
	}
}
