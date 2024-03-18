package BackJoon.Day4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class TokidokiSnackDream {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] str = br.readLine().split(" ");
		Stack<Integer> line1 = new Stack<>();
		Stack<Integer> line2 = new Stack<>();

		for(int i = n - 1; i > -1; i--){
			line1.push(Integer.parseInt(str[i]));
		}

		int num = 1;
		String result = "Nice";
		while(true){
			if(line1.isEmpty() && line2.isEmpty()){
				break;
			}
			if(line1.isEmpty()){
				if(line2.peek() != num){
					result = "Sad";
					break;
				}else{
					line2.pop();
					num++;
				}
			}else {
				if (line1.peek() != num) {
					if(line2.isEmpty()){
						line2.push(line1.pop());
					}else{
						if (line2.peek() != num) {
							line2.push(line1.pop());
						} else {
							line2.pop();
							num++;
						}
					}
				} else {
					line1.pop();
					num++;
				}
			}
		}

		System.out.println(result);
	}
}
