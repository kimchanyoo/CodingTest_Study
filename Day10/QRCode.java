package Day10;

import java.util.Scanner;

public class QRCode {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int q = sc.nextInt();
		int r = sc.nextInt();
		String code = sc.next();

		String result = solution(q, r, code);

		System.out.println(result);
	}
	public static String solution(int q, int r, String code) {
		String answer = "";

		char[] stringList = code.toCharArray();

		for(int i = 0; i < stringList.length; i++){
			int rest = i % q;
			if(rest == r){
				answer += stringList[i];
			}
		}

		return answer;
	}
}
