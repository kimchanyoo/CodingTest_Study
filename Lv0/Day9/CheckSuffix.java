package Day9;

import java.util.Scanner;

public class CheckSuffix {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String my_string = sc.next();
		String is_suffix = sc.next();

		int result = solution(my_string, is_suffix);

		System.out.println(result);
	}
	public static int solution(String my_string, String is_suffix){
		int answer = 0;

		String[] suffixList = new String[my_string.length()];

		for(int i = 0; i < my_string.length(); i++){
			suffixList[i] = my_string.substring(i);
			if(is_suffix.equals(suffixList[i])){
				answer = 1;
				return answer;
			}
		}

		return answer;
	}
}
