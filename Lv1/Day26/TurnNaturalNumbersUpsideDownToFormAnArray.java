package Lv1.Day26;

import java.util.Arrays;
import java.util.Scanner;

public class TurnNaturalNumbersUpsideDownToFormAnArray {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();

		int[] result = solution(n);

		System.out.println(Arrays.toString(result));
	}
	public static int[] solution(long n) {
		char[] nList = Long.toString(n).toCharArray();
		int[] answer = new int[nList.length];
		for(int i = 0; i < nList.length; i++){
			answer[i] = Integer.parseInt(String.valueOf(nList[nList.length - i -1]));
		}

		return answer;
	}
}
