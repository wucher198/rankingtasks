package pl.myjava.checks;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SpeedTestOfCreatingArray {
	public static void main(String[] args) {
		putICheckIfAbsance();
		putIfAbsence();
	}
	
	public static void putIfAbsence() {
		Map<Integer, List<String>> map = new HashMap<>();
		Integer counter = 0;
		
		long startTime = new Date().getTime();
		
		for (int count = 0; count < 100000000; count++, counter++) {
			map.putIfAbsent(counter, new ArrayList<>());
			
			if (counter > 50) {
				counter = 0;
			}
		}
		
		long endTime = new Date().getTime();
		System.out.println((endTime - startTime));
		map = null;
	}
	
	public static void putICheckIfAbsance() {
		Map<Integer, List<String>> map = new HashMap<>();
		Integer counter = 0;
		
		long startTime = new Date().getTime();
		
		for (int count = 0; count < 100000000; count++, counter++) {
			if (map.get(counter) != null) {
				map.put(counter, new ArrayList<>());
			}
			
			if (counter > 50) {
				counter = 0;
			}
		}
		
		long endTime = new Date().getTime();
		System.out.println((endTime - startTime));
		map = null;
	}
}
