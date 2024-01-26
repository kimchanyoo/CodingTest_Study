package Day11;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveCharacter {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String my_string = sc.next();
		ArrayList<Integer> list = new ArrayList<Integer>();
		while(sc.hasNextInt()){
			list.add(sc.nextInt());
		}
		int listsize = list.size();
		int[] indices = new int[listsize];

		for(int i = 0; i < listsize; i++){
			indices[i] = list.get(i).intValue();
		}

		StringBuilder result = solution(my_string ,indices);

		System.out.println(result);
	}

	public static StringBuilder solution(String my_string, int[] indices) {
		StringBuilder answer = new StringBuilder();
		char[] strList = my_string.toCharArray();

		for(int i : indices){
			strList[i] = '0';
		}

		for(char i : strList){
			if(i != '0'){
				answer.append(i);
			}
		}

		return answer;
	}
}
