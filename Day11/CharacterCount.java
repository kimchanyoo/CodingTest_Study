package Day11;

import java.util.Arrays;
import java.util.Scanner;

public class CharacterCount {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String my_string = sc.nextLine();

		int[] result = solution(my_string);

		System.out.println(Arrays.toString(result));
	}
	public static int[] solution(String my_string) {
		int[] answer = new int[52];
		char[] stringList = my_string.toCharArray();

		for(int i = 0; i < stringList.length; i++){
			for(int j = 0; j < 52; j++){
				if(j < 26 && stringList[i] == 65 + j){
					answer[j] += 1;
				} else if (j >= 26 && stringList[i] == 71 + j ) {
					answer[j] += 1;
				}
			}
		}

		return answer;
	}
}
