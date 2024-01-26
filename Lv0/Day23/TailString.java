package Day23;

import java.util.ArrayList;
import java.util.Scanner;

public class TailString {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String ex = sc.next();
		ArrayList<String> strList = new ArrayList<>();
		while(sc.hasNext()){
			strList.add(sc.next());
		}
		String[] str_list = new String[strList.size()];
		for(int i = 0; i < str_list.length; i++){
			str_list[i] = strList.get(i);
		}

		String result = solution(str_list, ex);

		System.out.println(result);
	}
	public static String solution(String[] str_list, String ex) {
		String answer = "";

		for(int i = 0; i < str_list.length; i++){
			if(!str_list[i].contains(ex)){
				answer += str_list[i];
			}
		}

		return answer;
	}
}
