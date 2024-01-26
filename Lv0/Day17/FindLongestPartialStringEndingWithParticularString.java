package Day17;

import java.util.Scanner;

public class FindLongestPartialStringEndingWithParticularString {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String myString = sc.next();
		String pat = sc.next();

		int result = solution(myString, pat);

		System.out.println(result);
	}
	public static int solution(String myString, String pat) {
		int answer = 0;
		int temp = 0;
		char[] myStringList = myString.toCharArray();
		char[] patList = pat.toCharArray();

		for(int i = 0; i <= myStringList.length - patList.length; i++){
			for(int j = 0; j < patList.length; j++){
				if(myStringList[i + j] == patList[j]){
					temp++;
				}
			}
			if(temp == patList.length){
				answer++;
			}
			temp = 0;
		}

		return answer;
	}
}
