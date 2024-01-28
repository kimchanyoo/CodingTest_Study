package Lv1.Day28;

import java.util.Scanner;

public class MakingStrangeCharacters {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();

		String result = solution(s);

		System.out.println(result);
	}
	public static String solution(String s) {
		char[] chars = s.toCharArray();
		int idx = 0;

		for (int i = 0; i < chars.length; i++) {
			if (chars[i] == ' ')
				idx = 0;
			else
				chars[i] = (idx++ % 2 == 0 ? Character.toUpperCase(chars[i]) : Character.toLowerCase(chars[i]));
		}

		return String.valueOf(chars);
	}
}

/*
잘 짠 코드
		String answer = "";
        int cnt = 0;
        String[] array = s.split("");

        for(String ss : array) {
            cnt = ss.contains(" ") ? 0 : cnt + 1;
            answer += cnt%2 == 0 ? ss.toLowerCase() : ss.toUpperCase();
        }
		return answer;
 */
