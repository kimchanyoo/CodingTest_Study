package Day1;

import java.util.Scanner;

public class ChangeUpperLower {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String result = "";
		for(int i = 0; i < a.length(); i++){
			char temp = a.charAt(i);
			if(Character.isUpperCase(temp))
				result += Character.toLowerCase(temp);
			if(Character.isLowerCase(temp))
				result += Character.toUpperCase(temp);
		}
		System.out.println(result);
	}
}
