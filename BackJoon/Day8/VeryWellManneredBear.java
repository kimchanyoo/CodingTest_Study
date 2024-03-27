package BackJoon.Day8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class VeryWellManneredBear {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Set<String> set = new HashSet<>();
		int count = 0;
		int chatUser = 0;

		for(int i = 0; i < n; i++){
			String input = br.readLine();
			if(input.equals("ENTER")){
				set.clear();
				chatUser = 0;
				continue;
			}
			set.add(input);
			if(set.size() != chatUser){
				chatUser++;
				count++;
			}
		}

		System.out.println(count);
	}
}
