package Lv1.Day29;

import java.util.Scanner;

public class CodeOfCaesar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = "";

		String result = solution(s, n);

		System.out.println(s);
	}
	public static String solution(String s, int n) {
		String answer = "";
		for(int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
			if(ch==' ') { //공백
				answer += ch;
				continue;
			}
			if(ch>='a' && ch<='z') { //소문자
				if(ch+n > 'z') {
					answer += (char)(ch-26+n);
				}else {
					answer += (char)(ch+n);
				}
			}else if(ch>='A' && ch<='Z') { //대문자
				if(ch+n > 'Z') {
					answer += (char)(ch-26+n);
				}else {
					answer += (char)(ch+n);
				}
			}
		}
		return answer;
	}
}
