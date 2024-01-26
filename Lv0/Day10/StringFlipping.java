package Day10;

import java.util.Scanner;

public class StringFlipping {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String my_string = sc.nextLine();
		int s = sc.nextInt();
		int e = sc.nextInt();

		String result = solution(my_string, s, e);

		System.out.println(result);
	}
	public static String solution(String my_string, int s, int e) {
		String answer = "";
		int length = e - s;
		char[] stringList = my_string.toCharArray();

		for(int i = 0; i <= length / 2; i++){
			char temp = stringList[s + i];
			stringList[s + i] = stringList[e - i];
			stringList[e - i] = temp;
		}

		answer = new String(stringList);

		return answer;
	}
}
