package Day11;

import java.util.Arrays;
import java.util.Scanner;

public class CountDown {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int start_num = sc.nextInt();
		int end_num = sc.nextInt();

		int[] result = solution(start_num, end_num);

		System.out.println(Arrays.toString(result));
	}
	public static int[] solution(int start_num, int end_num) {
		int[] answer = new int[start_num - end_num + 1];
		int number = start_num;
		for(int i = 0; i < answer.length ; i++){
			answer[i] = number;
			number--;
		}

		return answer;
	}
}
