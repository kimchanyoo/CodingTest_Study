package Day2;

import java.util.Scanner;

public class OverlapString {
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		String my_string = sc.next();
		String overwrite_string = sc.next();
		int s = sc.nextInt();

		String result = solution(my_string, overwrite_string, s);

		System.out.println(result);
	}
	public static String solution(String my_string, String overwrite_string, int s) {
		String answer = "";
		char[] original =  my_string.toCharArray();
		char[] changeTarget = overwrite_string.toCharArray();

		for(int i = 0; i < overwrite_string.length(); i++){
			original[s + i] = changeTarget[i];
		}
		answer = new String(original);

		return answer;
	}

	/*
	더 좋은 풀이
	class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String before = my_string.substring(0, s);
        String after = my_string.substring(s + overwrite_string.length());
        return before + overwrite_string + after;
    }
}
	 */
}

