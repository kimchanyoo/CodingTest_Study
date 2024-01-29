package Lv1.Day29;

import java.util.ArrayList;
import java.util.Scanner;

public class Trio {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> order = new ArrayList<>();
		while(sc.hasNextInt()){
			order.add(sc.nextInt());
		}
		int[] number = new int[order.size()];
		for(int i = 0; i < number.length; i++){
			number[i] = order.get(i);
		}

		int result = solution(number);

		System.out.println(result);
	}
	public static int solution(int[] number) {
		int answer = 0;

		for(int i = 0; i < number.length; i++) {
			for(int j = i + 1; j < number.length; j++) {
				for(int k = j + 1; k < number.length; k++) {
					if(number[i] + number[j] + number[k] == 0) {
						answer++;
					}
				}
			}
		}
		return answer;
	}
}
