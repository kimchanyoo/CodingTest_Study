package Day15;

import java.util.Scanner;

public class FindDesiredString {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String myString = sc.next();
		String pat = sc.next();

		int result = solution(myString, pat);

		System.out.println(result);
	}
	public static int solution(String myString, String pat){
		int answer = 0;
		int number = 0;

		myString = myString.toUpperCase();
		pat = pat.toUpperCase();
		char[] myStringList = myString.toCharArray();
		char[] patList = pat.toCharArray();

		if(myStringList.length == patList.length){
			for(int i = 0; i < myStringList.length; i++){
				if(myStringList[i] == patList[i]){
					number++;
				}
			}
			if(number == patList.length) {
				answer = 1;
			}
		}else{
			for(int i = 0; i < myStringList.length - patList.length; i++){
				for(int j = 0; j < patList.length; j++){
					if(myStringList[j + i] == patList[j]){
						number++;
					}
				}
				if(number == patList.length){
					answer = 1;
					break;
				}else{
					number = 0;
				}
			}
		}

		return answer;
	}
}

/*
더 나은 풀이
1. indexOf를 사용해서 문자열이 존재하는지 확인하는 방식
public int solution(String myString, String pat) {
        int answer = 0;
        String str = myString.toLowerCase();
        String str2 = pat.toLowerCase();

        if (str.indexOf(str2) != -1) {
            return 1;
        }
        return 0;
}

2. contains를 활용하는 방식
public int solution(String myString, String pat) {
        int answer = 0;
        if(myString.toLowerCase().contains(pat.toLowerCase())) {
            answer = 1;
        }
        return answer;
}
 */
