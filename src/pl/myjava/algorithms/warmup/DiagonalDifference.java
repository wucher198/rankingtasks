package pl.myjava.algorithms.warmup;

import java.util.Scanner;

public class DiagonalDifference {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		int[][] matrix = new int[size][size];
		
		for (int x = 0; x < size; x++) {
			for (int y = 0; y < size; y++) {
				matrix[x][y] = in.nextInt();
			}
		}
		
		System.out.println(absDiffFromDiagonal(size, matrix));
	}
	
	public static int absDiffFromDiagonal(int size, int[][] matrix) {
		int result = 0;
		int first = 0;
		int second = 0;
		int index1 = 0;
		int index2 = size - 1;
		
		while (index1 < size) {
			first += matrix[index1][index1];
			second += matrix[index2][index1];
			index1++;
			index2--;
		}		
		
		return Math.abs(first - second);
	}
}
