package pl.myjava.algorithms.warmup;

import java.util.Scanner;

public class CircularArrayRotation {
	private int n = 0; 	// Array Size
	private int k = 0;	// Number of rotation
	private int q = 0; 	// Number of queries for elements
	private int[] a = null;	// Our array
	private int[] i = null; // Our index query
	private Scanner in = null;
	
	/*
	 * Input:
	 * n k q
	 * a(0), a(1), ... , a(n-1), a(n)
	 * i(1)
	 * i(2)
	 * ...
	 * i(q)
	 * 
	 * a - array element
	 * i - index that we want to know after rotate
	 */
	
	public static void main(String[] args) {
		CircularArrayRotation circular = new CircularArrayRotation(new Scanner(System.in));
		circular.readInput();
		circular.rotate();
		circular.getAnswerToQuery();
	}
	
	public CircularArrayRotation(Scanner in) {
		this.in = in;
	}
	
	private void readInput() {
		String[] line = in.nextLine().split(" ");
		n = Integer.valueOf(line[0]);
		k = Integer.valueOf(line[1]);
		q = Integer.valueOf(line[2]);
		line = in.nextLine().split(" ");
		a = new int[n];
		
		for (int count = 0; count < n; count++) {
			a[count] = Integer.valueOf(line[count]);
		}
		
		i = new int[q];
		
		for (int count = 0; count < q; count++) {
			i[count] = in.nextInt();
		}
	}
	
	private void rotate() {
		int[] tmp = new int[n];
		int tmpIdx = 0;
		int howManyRotations = (k % n);
		
		for (int count = a.length - howManyRotations; count < n; count++, tmpIdx++) {
			tmp[tmpIdx] = a[count];
		}
		
		
		for (int count = 0; count < n - howManyRotations; count++, tmpIdx++) {
			tmp[tmpIdx] = a[count];
		}
		
		a = tmp;		
	}
	
	private void getAnswerToQuery() {
		for (int count = 0; count < q; count++) {
			System.out.println(a[i[count]]);
		}
	}
}
