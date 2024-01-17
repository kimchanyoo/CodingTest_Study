package Day17;

import java.util.Arrays;
import java.util.Scanner;

public class SeparateBySpace2 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String my_string = sc.next();

		String[] result = solution(my_string);

		System.out.println(Arrays.toString(result));
	}

	public static String[] solution(String my_string) {
		my_string = my_string.trim().replaceAll("\\s+", " ");
		String[] result = my_string.split(" ");

		return result;
	}
}
