package BackJoon.Day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Zero {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int k = Integer.parseInt(br.readLine());
		Stack<Integer> stack = new Stack<>();
		int result = 0;

		for(int i = 0; i < k; i++){
			int num = Integer.parseInt(br.readLine());

			if(num == 0){
				int temp = stack.pop();
				result -= temp;
			}
			else{
				stack.push(num);
				result += num;
			}
		}

		System.out.println(result);
	}
}
