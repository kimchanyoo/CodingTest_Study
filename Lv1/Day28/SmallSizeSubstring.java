package Lv1.Day28;

import java.util.Scanner;

public class SmallSizeSubstring {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String t = sc.next();
		String p = sc.next();

		int result = solution(t, p);

		System.out.println(result);
	}
	public static int solution(String t, String p) {
		int answer = 0;
		char[] tList = t.toCharArray();

		for(int i = 0; i < tList.length - p.length(); i++){
			String number = "";
			for(int j = i; j < p.length() + i; j++){
				number += tList[j];
			}
			if(Integer.parseInt(number) <= Integer.parseInt(p)){
				answer++;
			}
		}

		return answer;
	}
}
/*
다른 사람 코드
int length = t.length() - p.length() + 1;
        long pNum = Long.parseLong(p);
        int answer = 0;

        for (int i = 0; i < length; i++) {
            String temp = t.substring(i, i + p.length());

            if (Long.parseLong(temp) <= pNum) {
            	answer++;
            }
        }
        return answer;
 */
