package Day16;

import java.util.Scanner;

public class CapitalizeParticularCharacter {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String my_string = sc.next();
		String alp = sc.next();

		String result = solution(my_string, alp);

		System.out.println(result);
	}
	public static String solution(String my_string, String alp) {
		char target_number = alp.charAt(0);
		target_number -= 32;
		System.out.println(target_number);

		my_string = my_string.replace(alp.charAt(0), target_number);
		return my_string;
	}
}

/*
더 깔끔한 방식
public String solution(String my_string, String alp) {
        String a = alp.toUpperCase();
        return my_string.replaceAll( alp, a);
}
 */
