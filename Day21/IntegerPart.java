package Day21;

import java.util.Scanner;

public class IntegerPart {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double flo = sc.nextDouble();
		int result = solution(flo);

		System.out.println(result);
	}

	public static int solution(double flo) {
		int answer = (int)flo;

		return answer;
	}
}
