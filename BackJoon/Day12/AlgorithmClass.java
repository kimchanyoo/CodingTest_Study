package BackJoon.Day12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AlgorithmClass {
	static int countRecursion = 0;
	static int countDynamic = 0;
	static int[] dp;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		dp = new int[n];

		recursion(n);
		dynamic(n);

		System.out.println(countRecursion + " " + countDynamic);
	}
	public static int recursion(int n){
		if(n == 1 || n == 2){
			countRecursion++;
			return 1;
		}else{
			return recursion(n - 1) + recursion(n - 2);
		}
	}
	public static int dynamic(int n){
		dp[0] = 1;
		dp[1] = 1;

		for(int i = 2; i < n; i++){
			countDynamic++;
			dp[i] = dp[i - 1] + dp[i - 2];
		}
		return dp[n - 1];
	}
}
