package Day18;

import java.util.Scanner;

public class CalculatingSimpleEquations {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String binomial = sc.next();


		int result = solution(binomial);

		System.out.println(result);
	}
	public static int solution(String binomial) {
		int answer = 0;

		String[] binomialList = binomial.split("\\s+");

		answer = switch (binomialList[1]) {
			case "+" -> Integer.parseInt(binomialList[0]) + Integer.parseInt(binomialList[2]);
			case "-" -> Integer.parseInt(binomialList[0]) - Integer.parseInt(binomialList[2]);
			case "*" -> Integer.parseInt(binomialList[0]) * Integer.parseInt(binomialList[2]);
			default -> answer;
		};

		return answer;
	}
}
