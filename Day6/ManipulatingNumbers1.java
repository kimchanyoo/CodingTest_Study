package Day6;

import java.util.Scanner;

public class ManipulatingNumbers1 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String control = sc.next();

		int result = solution(n, control);

		System.out.println(result);
	}

	public static int solution(int n, String control) {
		int answer = n;

		char[] controlList = control.toCharArray();

		for(int i = 0; i < controlList.length; i++){
			if(controlList[i] == 'w'){
				answer += 1;
			}else if(controlList[i] == 's'){
				answer -= 1;
			}else if(controlList[i] == 'd'){
				answer += 10;
			}else if(controlList[i] == 'a'){
				answer -= 10;
			}
		}

		return answer;
	}
}
