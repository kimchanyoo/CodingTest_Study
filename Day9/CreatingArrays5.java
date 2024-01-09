package Day9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CreatingArrays5 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] intStrs = str.split(" ");
		int k = sc.nextInt();
		int s = sc.nextInt();
		int l = sc.nextInt();

		int[] result = solution(intStrs, k, s, l);

		System.out.println(Arrays.toString(result));
	}
	public static int[] solution(String[] intStrs, int k, int s, int l) {
		ArrayList<Integer> answerList = new ArrayList<>();

		for(int i = 0; i < intStrs.length; i++){
			String str = intStrs[i].substring(s, s + l);
			int temp = Integer.parseInt(str);
			System.out.println(temp);
			if(temp > k){
				answerList.add(temp);
			}
		}

		int[] answer = new int[answerList.size()];
		for(int i = 0; i < answerList.size(); i++){
			answer[i] = answerList.get(i);
		}

		return answer;
	}
}
