package pl.myjava.algorithms.warmup;

import java.util.Scanner;

public class CompareTriplets {
	private static final int NUM_OF_ROUNDS = 3;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		CompareTriplets solution = new CompareTriplets();
		int[] pointsOfA = solution.readPoints(NUM_OF_ROUNDS, in);
		int[] pointsOfB = solution.readPoints(NUM_OF_ROUNDS, in);
		int scoreOfA = 0;
		int scoreOfB = 0;

		for (int count = 0; count < 3; count++) {
			if (pointsOfA[count] > (pointsOfB[count])) {
				scoreOfA++;
			}
			if (pointsOfA[count] < (pointsOfB[count])) {
				scoreOfB++;
			}
		}

		System.out.println(scoreOfA + " " + scoreOfB);
	}

	private int[] readPoints(int numberOfRounds, final Scanner in) {
		int[] result = new int[numberOfRounds];

		for (int count = 0; count < numberOfRounds; count++) {
			if (in.hasNextInt()) {
				result[count] = in.nextInt();
			}
		}

		return result;
	}
}
