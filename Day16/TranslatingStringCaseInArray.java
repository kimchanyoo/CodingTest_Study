package Day16;

import java.util.Arrays;
import java.util.Scanner;

public class TranslatingStringCaseInArray {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String[] strArr = str.split("");

		String[] result = solution(strArr);

		System.out.println(Arrays.toString(result));
	}

	public static String[] solution(String[] strArr) {
		for(int i = 0; i < strArr.length; i++){
			if(i % 2 == 0){
				strArr[i] = strArr[i].toLowerCase();
			}else{
				strArr[i] = strArr[i].toUpperCase();
			}
		}
		return strArr;
	}
}
