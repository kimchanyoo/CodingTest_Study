package Day5;

import java.util.ArrayList;
import java.util.Scanner;

public class AddParticularPortInEquilibriumSequence {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		ArrayList<Boolean> list = new ArrayList<Boolean>();
		while(sc.hasNextBoolean()){
			list.add(sc.nextBoolean());
		}
		int listsize = list.size();
		Boolean[] included = list.toArray(new Boolean[listsize]);

		int result = solution(a, b, included);

		System.out.println(result);
	}

	public static int solution(int a, int d, Boolean[] included) {
		int answer = 0;

		for(int i = 0; i < included.length; i++){
			if(included[i]){
				answer += a + (d*i);
			}
		}

		return answer;
	}
}
