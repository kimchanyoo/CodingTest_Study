package Day17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class RemoveAD {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String[] strArr = str.split(" ");

		String[] result = solution(strArr);

		System.out.println(Arrays.toString(result));
	}

	public static String[] solution(String[] strArr) {
		ArrayList<String> resultList = new ArrayList<>();
		for(int i = 0; i < strArr.length; i++){
			if(!strArr[i].contains("ad")) {
				resultList.add(strArr[i]);
			}
		}
		String[] result = new String[resultList.size()];
		for(int i = 0; i < result.length; i++){
			result[i] = resultList.get(i);
		}

		return result;
	}
}
