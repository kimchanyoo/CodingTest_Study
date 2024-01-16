package Day16;

import java.util.Scanner;

public class EmphasizeA {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String myString = sc.next();

		String result = solution(myString);

		System.out.println(result);
	}
	public static String solution(String myString) {
		myString = myString.toLowerCase();
		char[] strArr = myString.toCharArray();
		for(int i = 0; i < strArr.length; i++){
			if(strArr[i] == 'a'){
				strArr[i] = 'A';
			}
		}

		String answer = new String(strArr);

		return answer;
	}
}

/*
더 좋은 방법
replace를 사용해서 대체한다
public String solution(String myString) {
        myString = myString.toLowerCase();
        myString = myString.replace('a', 'A');

        return myString;
}
 */