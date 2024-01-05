package Day5;

import java.util.ArrayList;
import java.util.Scanner;

public class AttachedNumber {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		while(sc.hasNextInt()){
			list.add(sc.nextInt());
		}
		int listsize = list.size();
		int[] num_list = new int[listsize];

		for(int i = 0; i < listsize; i++){
			num_list[i] = list.get(i).intValue();
		}

		int result = solution(num_list);

		System.out.println(result);
	}

	public static int solution(int[] num_list) {
		int answer = 0;

		ArrayList<String> odd = new ArrayList<>();
		ArrayList<String> even = new ArrayList<>();

		for(int i = 0; i < num_list.length; i++){
			if(num_list[i] % 2 == 0){
				even.add(Integer.toString(num_list[i]));
			}else{
				odd.add(Integer.toString(num_list[i]));
			}
		}

		answer = Integer.parseInt(String.join("",odd)) +
				Integer.parseInt(String.join("",even));


		return answer;
	}
}
