package pl.myjava.algorithms.warmup;

import java.util.Scanner;

//12:32:12AM -> 00:32:12
//12:45:54PM -> 12:45:54

public class TimeConversion {
	private enum PERIODS {PM, AM};
	private static final String SEPARATOR = ":";
	private static final int DIFFERENC = 12;
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String dateIn12 = in.nextLine();
		String dateIn24 = "";
		int numOfNotNeededChar = 3;
		
		String[] separated = dateIn12.split(":");
		int hour = Integer.valueOf(separated[0]);
		
		if (dateIn12.contains(PERIODS.PM.name())) {
			if (hour < 12) {
				hour += DIFFERENC;
								
				if (hour >= 24) {
					hour = 0;
				}
			}
		} else if (dateIn12.contains(PERIODS.AM.name())){
			if (hour >= 12) {
				hour = 0;
			}
		}
		
		separated[0] = String.format("%02d", hour);
		
		for (String onePart : separated) {
			dateIn24 += onePart + ":";
		}
		
		dateIn24 = dateIn24.substring(0, dateIn24.length() - numOfNotNeededChar);
		System.out.println(dateIn24);
	}
}
