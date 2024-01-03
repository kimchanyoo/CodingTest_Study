package Day3;

import java.util.Scanner;

public class MixingStrings {
	public static void main(String[] args){
		Scanner sc  = new Scanner(System.in);
		String str1 = sc.next();
		String str2 = sc.next();

		String result = solution(str1, str2);

		System.out.println(result);
	}

	public static String solution(String str1, String str2) {
		String answer = "";
		char[] temp1 =  str1.toCharArray();
		char[] temp2 = str2.toCharArray();
		char[] result = new char[temp1.length * 2];
		int s = 0;

		for(int i = 0; i < temp1.length; i++){
			result[s] = temp1[i];
			s++;
			result[s] = temp2[i];
			s++;
		}

		answer = new String(result);
		return answer;
	}
}
