package Lv1.Day34;

import java.util.ArrayList;
import java.util.Scanner;

public class OverPainting {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		ArrayList<Integer> order = new ArrayList<>();
		while(sc.hasNextInt()){
			order.add(sc.nextInt());
		}
		int[] section = new int[order.size()];
		for(int i = 0; i < section.length; i++){
			section[i] = order.get(i);
		}

		int result = solution(n, m, section);

		System.out.println(result);
	}
	public static int solution(int n, int m, int[] section) {
		int start = section[0];
		int end = section[0] + (m-1);
		int ans = 1;

		for(int i : section){
			if(i>=start && i<=end)
				continue;
			else{
				start = i;
				end = i + (m-1);
				ans++;
			}

		}
		return ans;
	}
}
