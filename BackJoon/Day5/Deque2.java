package BackJoon.Day5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Deque2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Deque<Integer> deque2 = new ArrayDeque<>();
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();

		for(int i = 0; i < n; i++){
			st = new StringTokenizer(br.readLine(), " ");
			int num = Integer.parseInt(st.nextToken());
			if(num == 1){
				int x = Integer.parseInt(st.nextToken());
				deque2.addFirst(x);
			}else if(num == 2){
				int x = Integer.parseInt(st.nextToken());
				deque2.add(x);
			}else if(num == 3){
				if(deque2.isEmpty()){
					sb.append(-1).append('\n');
				}else{
					sb.append(deque2.removeFirst()).append('\n');
				}
			}else if(num == 4){
				if(deque2.isEmpty()){
					sb.append(-1).append('\n');
				}else{
					sb.append(deque2.removeLast()).append('\n');
				}
			}else if(num == 5){
				sb.append(deque2.size()).append('\n');
			}else if(num == 6){
				if(deque2.isEmpty()){
					sb.append(1).append('\n');
				}else{
					sb.append(0).append('\n');
				}
			}else if(num == 7){
				if(deque2.isEmpty()){
					sb.append(-1).append('\n');
				}else{
					sb.append(deque2.getFirst()).append('\n');
				}
			}else if(num == 8){
				if(deque2.isEmpty()){
					sb.append(-1).append('\n');
				}else{
					sb.append(deque2.getLast()).append('\n');
				}
			}
		}

		System.out.println(sb);
	}
}
