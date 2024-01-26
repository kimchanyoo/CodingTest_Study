package Day8;

import java.util.ArrayList;
import java.util.Scanner;

public class CreateStringByCombiningLetters {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String my_string = sc.next();
		ArrayList<Integer> list = new ArrayList<Integer>();
		while(sc.hasNextInt()){
			list.add(sc.nextInt());
		}
		int listsize = list.size();
		int[] index_list = new int[listsize];

		for(int i = 0; i < listsize; i++){
			index_list[i] = list.get(i).intValue();
		}

		StringBuilder result = solution(my_string, index_list);

		System.out.println(result);
	}

	public static StringBuilder solution(String my_string, int[] index_list) {
		StringBuilder answer = new StringBuilder();
		char[] stringList = my_string.toCharArray();

		for(int i = 0; i < index_list.length; i++){
			answer.append(stringList[index_list[i]]);
		}

		return answer;
	}
}
