package BackJoon.Day8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Statistics {
	static final int OFFSET = 4000;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		double sum = 0;
		int[] numCount = new int[8001];
		int[] numList = new int[n];

		for(int i = 0; i < n; i++){
			int num = Integer.parseInt(br.readLine());
			numCount[num + OFFSET]++;
			min = Math.min(min, num);
			max = Math.max(max, num);
			sum += num;
			numList[i] = num;
		}
		int[] tempList = Arrays.copyOf(numCount, numCount.length);
		Arrays.sort(numList);
		Arrays.sort(tempList);
		int mostCountNums = 1;
		int mostNum = 0;
		boolean isSecond = false;
		for(int i = tempList.length - 2; i > -1; i--){
			if(tempList[tempList.length - 1] != tempList[i]){
				break;
			}else{
				mostCountNums++;
			}
		}

		for(int i = 0; i < numCount.length; i++){
			if(mostCountNums == 1){
				if(numCount[i] == tempList[8000]){
					mostNum = i - OFFSET;
					break;
				}
			}else{
				if(numCount[i] == tempList[8000] && !isSecond){
					isSecond = true;
				}else if(numCount[i] == tempList[8000] && isSecond){
					mostNum = i - OFFSET;
					break;
				}
			}
		}
		sum = sum / (double) n;

		System.out.println(Math.round(sum));
		System.out.println(numList[n / 2]);
		System.out.println(mostNum);
		System.out.println(max - min);
	}
}
