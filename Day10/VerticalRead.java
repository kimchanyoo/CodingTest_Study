package Day10;

import java.util.Scanner;

public class VerticalRead {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String my_string = sc.nextLine();
		int m = sc.nextInt();
		int c = sc.nextInt();

		StringBuilder result = solution(my_string, m, c);

		System.out.println(result);
	}
	public static StringBuilder solution(String my_string, int m, int c) {
		StringBuilder answer = new StringBuilder();
		char[] stringList = my_string.toCharArray();
		int length = stringList.length;
		int index = 0;

		for(int i = 0; i < length / m; i++){
			index = m * i + c - 1;
			answer.append(stringList[index]);
		}

		return answer;
	}
}
