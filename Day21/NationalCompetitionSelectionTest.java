package Day21;

import java.util.Arrays;

public class NationalCompetitionSelectionTest {
	public int solution(int[] rank, boolean[] attendance) {
		int answer = 0;
		int[] rankList = new int[rank.length];
		for(int i = 0; i < rank.length; i++){
			if(attendance[i]) {
				rankList[i] = rank[i];
			}else{
				rankList[i] = Integer.MAX_VALUE;
			}
		}

		Arrays.sort(rankList);

		for(int i = 0; i < rank.length; i++){
			if(rankList[0]  == rank[i]){
				answer += 10000 * i;
			}else if(rankList[1]  == rank[i]){
				answer += 100 * i;
			}else if(rankList[2]  == rank[i]){
				answer += i;
			}
		}

		return answer;
	}
}
