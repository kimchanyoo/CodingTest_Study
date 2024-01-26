package Day8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class DiceGame3 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();

		int result = solution(a,b,c,d);

		System.out.println(result);
	}
	public static int solution(int a, int b, int c, int d){
		int answer = 0;
		ArrayList<Integer> diceList = new ArrayList<>();
		diceList.add(a);
		diceList.add(b);
		diceList.add(c);
		diceList.add(d);

		if(a == b && c == d && a == c){
			answer += 1111 * a;
		}else if(a == b && b == c && c != d){
			answer += (int)Math.pow(10 * a + d, 2);
		}else if(a == b && b == d && d != c){
			answer += (int)Math.pow(10 * a + c, 2);
		}else if(a == c && c == d && c != b){
			answer += (int)Math.pow(10 * a + b, 2);
		}else if(b == c && c == d && d != a){
			answer += (int)Math.pow(10 * b + a, 2);
		}else if(a == b && c == d){
			answer += (a + c) * Math.abs(a - c);
		}else if(a == c && b == d){
			answer += (a + b) * Math.abs(a - b);
		}else if(a == d && b == c){
			answer += (a + b) * Math.abs(a - b);
		}else if(a == b && c != d){
			answer += c * d;
		}else if(a == c && b != d){
			answer += b * d;
		}else if(a == d && b != c){
			answer += b * c;
		}else if(b == c && a != d){
			answer += a * d;
		}else if(b == d && a != c){
			answer += a * c;
		}else if(c == d && a != b){
			answer += a * b;
		}else{
			answer += Collections.min(diceList);
		}

		return answer;
	}
}
