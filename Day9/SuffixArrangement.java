package Day9;

import java.util.Arrays;
import java.util.Scanner;

public class SuffixArrangement {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String my_string = sc.nextLine();

		String[] result = solution(my_string);

		System.out.println(Arrays.toString(result));
	}
	public static String[] solution(String my_string) {
		String[] answer = new String[my_string.length()];

		for(int i = 0; i < my_string.length(); i++){
			answer[i] = my_string.substring(i);
		}

		Arrays.sort(answer);

		return answer;
	}
}
