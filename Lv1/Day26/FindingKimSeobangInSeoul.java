package Lv1.Day26;

import java.util.ArrayList;
import java.util.Scanner;

public class FindingKimSeobangInSeoul {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		ArrayList<String> order = new ArrayList<>();
		while(sc.hasNext()){
			order.add(sc.next());
		}
		String[] seoul = new String[order.size()];
		for(int i = 0; i < seoul.length; i++){
			seoul[i] = order.get(i);
		}

		String result = solution(seoul);

		System.out.println(result);
	}
	public static String solution(String[] seoul) {
		String answer = "";

		for(int i = 0; i < seoul.length; i++){
			if(seoul[i].equals("Kim")){
				answer = "김서방은 " + i + "에 있다";
				break;
			}
		}

		return answer;
	}
}
