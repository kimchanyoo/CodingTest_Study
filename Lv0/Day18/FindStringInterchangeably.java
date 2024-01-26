package Day18;

import java.util.Scanner;

public class FindStringInterchangeably {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String myString = sc.next();
		String pat = sc.next();

		int result = solution(myString, pat);

		System.out.println(result);
	}
	public static int solution(String myString, String pat) {
		int answer = 0;

		char[] strList = myString.toCharArray();

		for(int i = 0; i < strList.length; i++){
			if(strList[i] == 'A'){
				strList[i] = 'B';
			}else if(strList[i] == 'B'){
				strList[i] = 'A';
			}
		}

		myString = new String(strList);

		if(myString.contains(pat)){
			answer = 1;
		}

		return answer;
	}
}
