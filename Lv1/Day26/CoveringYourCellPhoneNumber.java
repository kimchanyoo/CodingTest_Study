package Lv1.Day26;

import java.util.Scanner;

public class CoveringYourCellPhoneNumber {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String phone_number = sc.next();

		String result = solution(phone_number);

		System.out.println(result);
	}
	public static String solution(String phone_number) {
		char[] numberList = phone_number.toCharArray();
		for(int i = 0; i < numberList.length - 4; i++){
			numberList[i] ='*';
		}

		return String.valueOf(numberList);
	}
}
