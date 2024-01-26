package Day10;

import java.util.Scanner;

public class CheckPrefix {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String my_string = sc.next();
		String is_prefix = sc.next();

		int result = solution(my_string, is_prefix);

		System.out.println(result);
	}
	public static int solution(String my_string, String is_prefix){
		int answer = 0;

		String[] prefixList = new String[my_string.length()];

		for(int i = 0; i < my_string.length(); i++){
			prefixList[i] = my_string.substring(0, i + 1);
			if(is_prefix.equals(prefixList[i])){
				answer = 1;
				return answer;
			}
		}

		return answer;
	}
}
