package Lv1.Day30;

import java.util.ArrayList;
import java.util.Scanner;

public class FoodFighting {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> order = new ArrayList<>();
		while(sc.hasNextInt()){
			order.add(sc.nextInt());
		}
		int[] food = new int[order.size()];
		for(int i = 0; i < food.length; i++){
			food[i] = order.get(i);
		}

		String result = solution(food);

		System.out.println(result);
	}
	public static String solution(int[] food) {
		StringBuilder str = new StringBuilder();

		for(int i = 1; i < food.length; i++){
			str.append(String.valueOf(i).repeat(food[i] / 2));
		}

		str.append(0);

		for(int i = food.length - 1; i >= 1; i--){
			str.append(String.valueOf(i).repeat(food[i] / 2));
		}

		return str.toString();
	}
}
