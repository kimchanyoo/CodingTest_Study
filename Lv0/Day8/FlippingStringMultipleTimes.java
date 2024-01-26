package Day8;

public class FlippingStringMultipleTimes {
	public String solution(String my_string, int[][] queries) {
		String answer = "";
		char[] stringList = my_string.toCharArray();

		for(int i = 0; i< queries.length; i++){
			int s = (int)queries[i][0];
			int e = (int)queries[i][1];
			for(int j = 0; j <= (e-s) / 2; j++){
				char temp = stringList[s + j];
				stringList[s + j] = stringList[e - j];
				stringList[e - j] = temp;
			}
		}

		answer = new String(stringList);

		return answer;
	}
}
