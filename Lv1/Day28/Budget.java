package Lv1.Day28;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Budget {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int budget = sc.nextInt();
		ArrayList<Integer> order = new ArrayList<>();
		while(sc.hasNextInt()){
			order.add(sc.nextInt());
		}
		int[] d = new int[order.size()];
		for(int i = 0; i < d.length; i++){
			d[i] = order.get(i);
		}

		int result = solution(d, budget);

		System.out.println(result);
	}
	public static int solution(int[] d, int budget) {
		Arrays.sort(d);
		int money = 0;
		int departments = 0;

		for(int i : d){
			money += i;
			if(money <= budget){
				departments++;
			}else{
				break;
			}
		}

		return departments;
	}
}
