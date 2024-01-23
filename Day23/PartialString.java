package Day23;

import java.util.Scanner;

public class PartialString {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		String str2 = sc.next();
		int result = solution(str2, str1);

		System.out.println(result);
	}
	public static int solution(String str2, String str1) {
		char[] strList = str2.toCharArray();

		for(int i = 0; i < str2.length(); i++){
			String answer ="";
			for(int j = i; j < str2.length(); j++){
				answer += String.valueOf(strList[j]);
				if(str1.equals(answer)){
					return 1;
				}
			}

		}

		return 0;
	}
}
