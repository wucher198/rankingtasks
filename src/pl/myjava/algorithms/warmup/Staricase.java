package pl.myjava.algorithms.warmup;

import java.util.Scanner;

public class Staricase {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		
		for (int y = 0; y < size; y++) {
			for (int x = 0; x < size; x++) {
				if (x < (size - y - 1)) {
					System.out.print(" ");
				} else {
					System.out.print("#");
				}
			}
			
			System.out.println();
		}
	}
}
