package Day20;

import java.util.Arrays;

public class CompareList {
	public int solution(int[] arr1, int[] arr2) {
		int answer = 0;

		int length1 = arr1.length;
		int length2 = arr2.length;

		if(length1 == length2){
			int sum1 = Arrays.stream(arr1).sum();
			int sum2 = Arrays.stream(arr2).sum();

			if(sum1 > sum2){
				answer = 1;
			}else if(sum1 < sum2){
				answer = -1;
			}
		}else{
			if(length1 > length2){
				answer = 1;
			}else{
				answer = -1;
			}
		}

		return answer;
	}
}
