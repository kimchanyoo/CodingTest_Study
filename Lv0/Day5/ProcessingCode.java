package Day5;

import java.util.ArrayList;
import java.util.Scanner;

public class ProcessingCode {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String code = sc.next();

		String result = solution(code);

		System.out.println(result);
	}

	public static String solution(String code) {
		String answer = "";
		int mode = 0;

		String[] arr = code.split("");
		ArrayList<String> result = new ArrayList<>();

		for(int i = 0; i < code.length(); i++){
			if(mode == 0){
				if(arr[i].equals("1")){
					mode = 1;
				}else{
					if(i % 2 == 0){
						result.add(arr[i]);
					}
				}
			}else if(mode == 1){
				if(arr[i].equals("1")){
					mode = 0;
				}else {
					if (i % 2 == 1) {
						result.add(arr[i]);
					}
				}
			}
		}

		answer = String.join("",result);

		if(answer.equals("")){
			answer = "EMPTY";
		}

		return answer;
	}
}

