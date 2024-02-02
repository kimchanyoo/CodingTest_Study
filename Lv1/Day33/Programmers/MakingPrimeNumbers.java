package Lv1.Day33.Programmers;

import java.util.ArrayList;
import java.util.Scanner;

public class MakingPrimeNumbers {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> order = new ArrayList<>();
		while(sc.hasNextInt()){
			order.add(sc.nextInt());
		}
		int[] nums = new int[order.size()];
		for(int i = 0; i < nums.length; i++){
			nums[i] = order.get(i);
		}

		int result = solution(nums);

		System.out.println(result);
	}
	public static int solution(int[] nums) {
		int answer = 0;
		int sum;
		int cnt = 0;
		for(int i = 0; i < nums.length - 2; i++){
			for(int j = i + 1; j < nums.length -1; j++){
				for(int k = j + 1; k < nums.length; k++){
					sum = nums[i] + nums[j] + nums[k];
					for(int e = 1; e * e <= sum; e++){
						if(e * e == sum) cnt++;
						else if(sum % e == 0) cnt += 2;
					}
					if(cnt == 2){
						answer++;
					}
					cnt = 0;
				}
			}

		}
		return answer;
	}
}
