package Day22;

import java.math.BigInteger;
import java.util.Scanner;

public class SumTwoValues {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		String result = solution(a, b);

		System.out.println(result);
	}
	public static String solution(String a, String b) {
		BigInteger numA = new BigInteger(a);
		BigInteger numB = new BigInteger(b);

		BigInteger sum = numA.add(numB);

		return sum.toString();
	}
}
