package Lv1.Day32;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Scanner;

public class YearOf2016 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		String result = solution(a, b);
		System.out.println(result);
	}
	public static String solution(int a, int b) {
		String time = "2016";
		time += "-" + String.format("%02d", a);
		time += "-" + String.format("%02d", b);

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate date = LocalDate.parse(time, formatter);
		DayOfWeek dayOfWeek = date.getDayOfWeek();

		return dayOfWeek.getDisplayName(TextStyle.SHORT, Locale.US).toUpperCase();
	}
}
