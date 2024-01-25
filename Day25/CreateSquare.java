package Day25;

public class CreateSquare {
	public int[][] solution(int[][] arr) {
		int rowLength = arr.length;
		int colLength = arr[0].length;
		for(int i = 1; i < rowLength; i++){
			if(colLength < arr[i].length){
				colLength = arr[i].length;
			}
		}

		int maxValue = Math.max(rowLength, colLength);
		int[][] answer = new int[maxValue][maxValue];

		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j < arr[i].length; j++){
				answer[i][j] = arr[i][j];
			}
		}

		return answer;
	}
}
