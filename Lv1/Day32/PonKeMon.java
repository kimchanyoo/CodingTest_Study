package Lv1.Day32;

import java.util.*;

public class PonKeMon {
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
		Set<Integer> set = new HashSet<>();
		for(int i : nums){
			set.add(i);
		}
		if(set.size() >= nums.length / 2){
			return nums.length / 2;
		}else{
			return set.size();
		}
	}
}
