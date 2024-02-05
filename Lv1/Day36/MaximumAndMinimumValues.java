package Lv1.Day36;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MaximumAndMinimumValues {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();

		String result = solution(s);

		System.out.println(result);
	}
	public static String solution(String s) {
		String answer = "";
		ArrayList<Integer> arr = new ArrayList<Integer>();
		String[] str = s.split(" ");

		for(int i=0; i<str.length; i++) {
			arr.add(Integer.parseInt(str[i]));
		}

		answer = "" + Collections.min(arr) + " " + Collections.max(arr);

		return answer;
	}
}
