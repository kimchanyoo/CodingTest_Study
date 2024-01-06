package Day6;

import java.util.ArrayList;
import java.util.Scanner;

public class ManipulatingNumbers2 {
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

		String result = solution(num_list);

		System.out.println(result);
	}

	public static String solution(int[] numLog) {
		String answer = "";

		ArrayList<String> result = new ArrayList<>();

		for(int i = 1; i < numLog.length; i++){
			if(numLog[i] - numLog[i-1] == 1){
				result.add("w");
			}else if(numLog[i] - numLog[i-1] == -1){
				result.add("s");
			}else if(numLog[i] - numLog[i-1] == 10){
				result.add("d");
			}else if(numLog[i] - numLog[i-1] == -10){
				result.add("a");
			}
		}

		answer = String.join("",result);

		return answer;
	}
}
