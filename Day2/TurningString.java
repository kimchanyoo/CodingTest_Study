package Day2;

import java.util.Scanner;

public class TurningString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		for(int i = 0; i < a.length(); i++){
			char temp = a.charAt(i);
			System.out.println(temp);
		}
	}
}