package BackJoon.Day1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class YourRatingIs {
	static String[] gradeList = {"A+", "A0", "B+", "B0", "C+", "C0", "D+", "D0", " ", "F"};
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double creditSum = 0;
		double sum = 0;
		StringTokenizer st;

		for(int i = 0; i < 20; i++){
			st = new StringTokenizer(br.readLine(), " ");
			String subject = st.nextToken();
			double credit = Double.parseDouble(st.nextToken());
			String grade = st.nextToken();

			if(grade.equals("P")){
				continue;
			}

			creditSum += credit;
			sum += credit * (4.5 - (0.5 * Arrays.asList(gradeList).indexOf(grade)));
		}

		System.out.printf("%.6f", sum / creditSum);
	}
}
