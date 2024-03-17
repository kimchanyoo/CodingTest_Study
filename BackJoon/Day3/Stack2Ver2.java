package BackJoon.Day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Stack2Ver2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st;
		Stack<Integer> myStack = new Stack<>();
		StringBuilder sb = new StringBuilder();

		for(int i = 0; i < n; i++){
			st = new StringTokenizer(br.readLine(), " ");
			int c = Integer.parseInt(st.nextToken());

			if(c == 1){
				int num = Integer.parseInt(st.nextToken());
				myStack.push(num);
			}else if(c == 2){
				if(myStack.isEmpty()){
					sb.append(-1).append('\n');
				}else{
					sb.append(myStack.pop()).append('\n');
				}
			}else if(c == 3){
				sb.append(myStack.size()).append('\n');
			}else if(c == 4){
				if(myStack.isEmpty()){
					sb.append(1).append('\n');
				}else{
					sb.append(0).append('\n');
				}
			}else if(c == 5){
				if(myStack.isEmpty()){
					sb.append(-1).append('\n');
				}else{
					sb.append(myStack.peek()).append('\n');
				}
			}
		}

		System.out.println(sb);
	}
}
