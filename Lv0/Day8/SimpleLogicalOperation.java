package Day8;

import java.util.Scanner;

public class SimpleLogicalOperation {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		boolean x1 = sc.nextBoolean();
		boolean x2 = sc.nextBoolean();
		boolean x3 = sc.nextBoolean();
		boolean x4 = sc.nextBoolean();

		Boolean result = solution(x1, x2, x3, x4);

		System.out.println(result);
	}
	public static boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
		boolean answer = true;
		boolean intermediate1 = false;
		boolean intermediate2 = false;

		if(x1 == x2){
			intermediate1 = x1;
		}else{
			intermediate1 = true;
		}

		if(x3 == x4){
			intermediate2 = x3;
		}else{
			intermediate2 = true;
		}

		if(intermediate1 == intermediate2){
			answer = intermediate1;
		}else{
			answer = false;
		}

		return answer;
	}
}
