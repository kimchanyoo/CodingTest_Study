package Lv1.Day30;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ClosestEquivalentLetter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();

		int[] result = solution(s);

		System.out.println(Arrays.toString(result));
	}
	public static int[] solution(String s) {
		int[] answer = new int[s.length()];
		Map<Character, Integer> map = new HashMap<>();

		for(int i = 0; i < s.length(); i++){
			if(!map.containsKey(s.charAt(i))){
				answer[i] = -1;
				map.put(s.charAt(i), i);
			}else{
				answer[i] = i - map.get(s.charAt(i));
				map.put(s.charAt(i), i);
			}
		}

		return answer;
	}
}
