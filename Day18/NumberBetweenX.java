package Day18;

import java.util.Arrays;
import java.util.Scanner;

public class NumberBetweenX {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String myString = sc.next();


		int[] result = solution(myString);

		System.out.println(Arrays.toString(result));
	}
	public static int[] solution(String myString) {
		String[] strList = myString.split("x", myString.length());
		int[] answer = new int[strList.length];
		for(int i = 0; i < strList.length; i++){
			answer[i] = strList[i].length();
		}

		return answer;
	}
}
