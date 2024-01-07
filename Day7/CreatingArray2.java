package Day7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CreatingArray2 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		int r = sc.nextInt();

		int[] result = solution(l, r);

		System.out.println(Arrays.toString(result));
	}
	public static int[] solution(int l, int r){
		ArrayList<Integer> answerList = new ArrayList<>();
		boolean isAnswer = false;

		for(int j = l; j <= r; j++){
			String temp = Integer.toString(j);
			char[] tempList = temp.toCharArray();
			for(int k = 0; k < tempList.length; k++){
				if(tempList[k] == '5'||tempList[k] == '0'){
					isAnswer = true;
				} else{
					isAnswer = false;
					break;
				}
			}
			if(isAnswer){
				answerList.add(j);
			}
		}

		if(answerList.isEmpty()){
			answerList.add(-1);
		}

		int[] answer = new int[answerList.size()];
		for(int j = 0; j < answerList.size(); j++){
			answer[j] = answerList.get(j);
		}

		return answer;
	}
}
/*
더 잘 푼 풀이
import java.util.ArrayList;

class Solution {
    public int[] solution(int l, int r) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i < 64; i++) {
            int num = Integer.parseInt(Integer.toBinaryString(i)) * 5;
            if (l <= num && num <= r)
                list.add(num);
        }

        return list.isEmpty() ? new int[] { -1 } : list.stream().mapToInt(i -> i).toArray();
    }
}
 */