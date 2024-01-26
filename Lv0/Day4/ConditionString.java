package Day4;

import java.util.Scanner;

public class ConditionString {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String ineq = sc.next();
		String eq = sc.next();
		int n = sc.nextInt();
		int m = sc.nextInt();

		int result = solution(ineq, eq, n, m);

		System.out.println(result);
	}

	public static int solution(String ineq, String eq, int n, int m) {
		int answer = 0;

		if(ineq.equals(">") && eq.equals("=")){
			if(n >= m){
				answer = 1;
			}
		}else if(ineq.equals("<") && eq.equals("=")){
			if(n <= m){
				answer = 1;
			}
		}else if(ineq.equals(">") && eq.equals("!")){
			if(n > m){
				answer = 1;
			}
		}else if(ineq.equals("<") && eq.equals("!")){
			if(n < m){
				answer = 1;
			}
		}

		return answer;
	}
}
