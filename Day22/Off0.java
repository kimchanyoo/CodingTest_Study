package Day22;

import java.util.Scanner;

public class Off0 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String n_str = sc.next();
		String result = solution(n_str);

		System.out.println(result);
	}
	public static String solution(String n_str) {
		String answer = "";

		int i = 0;
		while (i < n_str.length() && n_str.charAt(i) == '0') {
			i++;
		}

		while (i < n_str.length()) {
			answer += n_str.charAt(i);
			i++;
		}
		return answer;
	}
}
