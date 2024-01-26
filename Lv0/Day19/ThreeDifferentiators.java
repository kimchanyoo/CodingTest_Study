package Day19;

import java.util.Arrays;
import java.util.Scanner;

public class ThreeDifferentiators {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String myStr = sc.next();


		String[] result = solution(myStr);

		System.out.println(Arrays.toString(result));
	}
	public static String[] solution(String myStr) {
		String[] answer = Arrays.stream(myStr.split("a|b|c"))
				.filter(str -> !str.isEmpty())
				.toArray(String[]::new);
		if(answer.length == 0){
			String[] emptyList = {"EMPTY"};
			return emptyList;
		}
		return answer;
	}
}

