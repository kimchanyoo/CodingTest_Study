package Day24;

import java.util.ArrayList;
import java.util.Scanner;

public class CoffeeErrand {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		ArrayList<String> order = new ArrayList<>();
		while(sc.hasNext()){
			order.add(sc.next());
		}
		String[] str_list = new String[order.size()];
		for(int i = 0; i < str_list.length; i++){
			str_list[i] = order.get(i);
		}

		int result = solution(str_list);

		System.out.println(result);
	}
	public static int solution(String[] order) {
		int answer = 0;

		for(String e : order){
			if(e.contains("cafelatte")){
				answer += 5000;
			}else if(e.contains("americano")){
				answer += 4500;
			}else{
				answer += 4500;
			}
		}

		return answer;
	}
}
