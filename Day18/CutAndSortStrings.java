package Day18;

import java.util.Arrays;
import java.util.Scanner;

public class CutAndSortStrings {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String myString = sc.next();


		String[] result = solution(myString);

		System.out.println(Arrays.toString(result));
	}
	public static String[] solution(String myString) {
		String[] answer = Arrays.stream(myString.split("x"))
				.filter(str -> !str.isEmpty())
				.sorted()
				.toArray(String[]::new);
		return answer;
	}
}
