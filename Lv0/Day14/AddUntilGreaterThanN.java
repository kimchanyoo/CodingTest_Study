package Day14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class AddUntilGreaterThanN {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer> list = new ArrayList<Integer>();
		while(sc.hasNextInt()){
			list.add(sc.nextInt());
		}
		int listsize = list.size();
		int[] numbers = new int[listsize];

		for(int i = 0; i < listsize; i++){
			numbers[i] = list.get(i).intValue();
		}
		System.out.println(Arrays.toString(numbers));
		int result = solution(numbers, n);

		System.out.println(result);
	}

	public static int solution(int[] numbers, int n) {
		int answer = 0;
		int sum = 0;
		for(int i = 0; i < numbers.length; i++){
			sum += numbers[i];
			if(sum > n){
				answer = sum;
				break;
			}
		}

		return answer;
	}
}
