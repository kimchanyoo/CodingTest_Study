package Day14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ToDoList {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String[] todo_list = str.split("");
		ArrayList<Boolean> finishedList = new ArrayList<Boolean>();
		while(sc.hasNextBoolean()){
			finishedList.add(sc.nextBoolean());
		}
		boolean[] finished = new boolean[finishedList.size()];
		for(int i = 0; i < finished.length; i++){
			finished[i] = finishedList.get(i);
		}

		String[] result = solution(todo_list, finished);

		System.out.println(Arrays.toString(result));
	}

	public static String[] solution(String[] todo_list, boolean[] finished) {
		ArrayList<String> str_list = new ArrayList<>();
		for(int i = 0; i < todo_list.length; i++){
			if(!finished[i]){
				str_list.add(todo_list[i]);
			}
		}

		String[] answer = new String[str_list.size()];
		for(int i = 0 ; i < answer.length; i++){
			answer[i] = str_list.get(i);
		}

		return answer;
	}
}
