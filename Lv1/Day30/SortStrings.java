package Lv1.Day30;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SortStrings {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<String> order = new ArrayList<>();
		while(sc.hasNext()){
			order.add(sc.next());
		}
		String[] strings = new String[order.size()];
		for(int i = 0; i < strings.length; i++){
			strings[i] = order.get(i);
		}

		String[] result = solution(strings, n);

		System.out.println(Arrays.toString(result));
	}
	public static String[] solution(String[] strings, int n) {
		String[] answer = {};
		answer = new String[strings.length];
		int cnt = 0;

		Arrays.sort(strings);

		for(int i = 97; i < 123; i++) {
			for(int j = 0; j < strings.length; j++) {
				if(strings[j].charAt(n) == (char)i) {
					answer[cnt++] = strings[j];
				}
			}
		}
		return answer;
	}
}

/*
해결 방안
Arrays.sort(strings, new Comparator<String>(){
          @Override
          public int compare(String s1, String s2){
              if(s1.charAt(n) > s2.charAt(n)) return 1;
              else if(s1.charAt(n) == s2.charAt(n)) return s1.compareTo(s2);
              else if(s1.charAt(n) < s2.charAt(n)) return -1;
              else return 0;
          }
      });
      return strings;
 */
