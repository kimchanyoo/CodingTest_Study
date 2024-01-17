package Day17;

import java.util.Scanner;

public class CountHowManyStrings {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String myString = sc.next();
		String pat = sc.next();

		String result = solution(myString, pat);

		System.out.println(result);
	}
	public static String solution(String myString, String pat) {
		String answer = "";
		char[] myStringList = myString.toCharArray();
		int index = myString.lastIndexOf(pat);

		for(int i = 0; i < index + pat.length(); i++){
			answer += myStringList[i];
		}

		return answer;
	}
}
