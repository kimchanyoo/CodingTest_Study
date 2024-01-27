package Lv1.Day27;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class PlaceStringsInDescendingOrder {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();

		String result = solution(s);

		System.out.println(result);
	}
	public static String solution(String s) {
		String[] strList = s.split("");
		Arrays.sort(strList , Collections.reverseOrder());

		return String.join("", strList);
	}
}
