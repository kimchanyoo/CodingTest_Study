package Day8;

import java.util.Scanner;

public class DividedByNine {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String number = sc.next();

		int result = solution(number);

		System.out.println(result);

	}
	public static int solution(String number) {
		int answer = 0;
		String[] arr = number.split("");
		int sum = 0;

		for(int i = 0; i < arr.length; i++){
			sum += Integer.parseInt(arr[i]);
		}

		answer = sum % 9;

		return answer;
	}
}
