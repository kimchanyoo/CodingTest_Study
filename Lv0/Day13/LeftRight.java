package Day13;

import java.util.Arrays;
import java.util.Scanner;

public class LeftRight {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String[] str_list = str.split("");

		String[] result = solution(str_list);

		System.out.println(Arrays.toString(result));
	}

	public static String[] solution(String[] str_list) {
		StringBuilder str = new StringBuilder();
		boolean isFind = false;
		for(int i = 0; i < str_list.length; i++){
			if(str_list[i].equals("l")){
				for(int j = 0; j < i; j++){
					str.append(str_list[j]);
				}
				isFind = true;
				break;
			}else if(str_list[i].equals("r")){
				for(int j = i + 1; j < str_list.length; j++){
					str.append(str_list[j]);
				}
				isFind = true;
				break;
			}
		}

		if(isFind){
			if(str.length() == 0){
				String[] answer = new String[0];
				return answer;
			}else{
				String[] answer = str.toString().split("");
				return answer;
			}
		}else{
			String[] answer = new String[0];
			return answer;
		}
	}
}
