package com.monocept.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class MapArrayFrequency {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50, 10, 20, 50, 50, 60, 90, 80, 70, 10, 10,
				30, 40, 50, 40, 40, 20, 70, 90, 80, 50, 50, 40, 20));
		Map<Integer, Integer> frequencyCount = new HashMap<>();
		for (int i : list) {
			//frequencyCount.putIfAbsent(i, Collections.frequency(list, i));
			frequencyCount.put(i, frequencyCount.getOrDefault(i, 0) + 1);
		}
		System.out.println("|Key | |Frequency|");
		System.out.println("|----------------|");
		for (Map.Entry<Integer, Integer> e : frequencyCount.entrySet()) {
			System.out.println("| " + e.getKey() + " |--->---| " + e.getValue() + " |");
			System.out.println("|----------------|");
		}
//		int arr[] = { 1, 4, 2, 6, 3, 4, 7, 5, 9, 7, 8, 0, 0, 9, 9 };
//		List<Integer> list = new ArrayList<>();
//		for (int i : arr)
//			list.add(i);
//
//		Map<Integer, Integer> map = new HashMap<>();
//
//		for (Integer element : list) {
//
//			map.put(element, map.getOrDefault(element, 0) + 1);
//		}
//
//		System.out.println("Keys(element) : Values(frequencies)");
//		for (Entry<Integer, Integer> entry : map.entrySet())
//			System.out.println("      " + entry.getKey() + "  :  " + entry.getValue());
	}

}
