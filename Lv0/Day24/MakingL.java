package Day24;

import java.util.Scanner;

public class MakingL {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String myString = sc.next();
		String result = solution(myString);

		System.out.println(result);
	}
	public static String solution(String myString) {
		String answer = "";
		char[] strList = myString.toCharArray();

		for(char e : strList){
			if(e < 108){
				answer += 'l';
			}else{
				answer += e;
			}
		}

		return answer;
	}
}
