package BackJoon.Day8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class FriendlyChongChong {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Set<String> set = new HashSet<>();
		StringTokenizer st;
		set.add("ChongChong");

		for(int i = 0; i < n; i++){
			st = new StringTokenizer(br.readLine(), " ");
			String member1 = st.nextToken();
			String member2 = st.nextToken();

			if(set.contains(member1) && !set.contains(member2)){
				set.add(member2);
			} else if(!set.contains(member1) && set.contains(member2)){
				set.add(member1);
			}
		}

		System.out.println(set.size());
	}
}
