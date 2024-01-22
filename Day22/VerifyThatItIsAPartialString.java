package Day22;

import java.util.Scanner;

public class VerifyThatItIsAPartialString {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String my_string = sc.next();
		String target = sc.next();
		int result = solution(my_string, target);

		System.out.println(result);
	}
	public static int solution(String my_string, String target) {
		char[] strList = my_string.toCharArray();

		for(int i = 0; i < my_string.length(); i++){
			String answer ="";
			for(int j = i; j < my_string.length(); j++){
				answer += String.valueOf(strList[j]);
				if(target.equals(answer)){
					return 1;
				}
			}

		}

		return 0;
	}
}
