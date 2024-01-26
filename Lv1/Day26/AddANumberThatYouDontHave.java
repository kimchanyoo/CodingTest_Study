package Lv1.Day26;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class AddANumberThatYouDontHave {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> order = new ArrayList<>();
		while(sc.hasNextInt()){
			order.add(sc.nextInt());
		}
		int[] numbers = new int[order.size()];
		for(int i = 0; i < numbers.length; i++){
			numbers[i] = order.get(i);
		}

		int result = solution(numbers);

		System.out.println(result);
	}
	public static int solution(int[] numbers) {
		return 45 - Arrays.stream(numbers).sum();
	}
}
