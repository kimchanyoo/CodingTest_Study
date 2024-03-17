package BackJoon.Day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Bracket {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		Stack<String> stack = new Stack<>();
		StringBuilder sb = new StringBuilder();
		boolean isVPS = true;

		for(int i = 0; i < T; i++){
			String[] brackets = br.readLine().split("");
			for(int j = 0; j < brackets.length; j++){
				if(brackets[j].equals("(")){
					stack.push("(");
				}else if(brackets[j].equals(")")){
					if(stack.isEmpty()){
						isVPS = false;
						break;
					}else{
						stack.pop();
					}
				}
			}
			if(stack.isEmpty() && isVPS){
				sb.append("YES").append('\n');
			}else{
				sb.append("NO").append('\n');
				stack.clear();
			}
			isVPS = true;
		}

		System.out.println(sb);
	}
}
