package Day14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class FiveOfUs {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String[] names = str.split("");

		String[] result = solution(names);

		System.out.println(Arrays.toString(result));
	}

	public static String[] solution(String[] names) {
		ArrayList<String> str_list = new ArrayList<>();
		for(int i = 0; i < names.length; i = i + 5){
			str_list.add(names[i]);
		}
		String[] answer = new String[str_list.size()];
		for(int i = 0 ; i < answer.length; i++){
			answer[i] = str_list.get(i);
		}

		return answer;
	}
}
