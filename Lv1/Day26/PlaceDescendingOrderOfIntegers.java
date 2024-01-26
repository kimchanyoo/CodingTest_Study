package Lv1.Day26;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class PlaceDescendingOrderOfIntegers {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();

		long result = solution(n);

		System.out.println(result);
	}
	public static long solution(long n) {
		String[] nList = Long.toString(n).split("");
		Arrays.sort(nList, Comparator.reverseOrder());
		String number = "";
		for(int i = 0; i < nList.length; i++){
			number += nList[i];
		}

		return Long.parseLong(number);
	}
}
