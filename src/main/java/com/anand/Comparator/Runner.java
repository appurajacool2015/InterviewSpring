package com.anand.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Runner {
	
	public static void main(String a[]) {
		
		List<Laptop> laps = new ArrayList<Laptop>();
		laps.add( new Laptop("HP", 1200));
		laps.add(new Laptop("DELL", 1800));
		laps.add(new Laptop("DELL", 1900));
		laps.add(new Laptop("DELL", 2100));
		laps.add(new Laptop("Apple", 2200));
		
		Collections.sort(laps);
		System.out.println("=====Laptops Comparable=====");
		for(Laptop lap : laps){
			System.out.println(lap);
		}
		
		List<KeyboardComparator> keys = new ArrayList<KeyboardComparator>();
		keys.add( new KeyboardComparator("HP", 1200));
		keys.add(new KeyboardComparator("DELL", 1800));
		keys.add(new KeyboardComparator("DELL", 1900));
		keys.add(new KeyboardComparator("DELL", 2100));
		keys.add(new KeyboardComparator("Apple", 2200)); 
		
		Comparator<KeyboardComparator> comp = new Comparator<KeyboardComparator>(){

			@Override
			public int compare(KeyboardComparator key1, KeyboardComparator key2) {
				if((key1.getBrand().compareTo(key2.getBrand()) > 1) && (key1.getPrice() > key2.getPrice()))
					return 1;
				else if ((key1.getBrand().compareTo(key2.getBrand()) < 1) && (key1.getPrice() < key2.getPrice()))
					return -1;
				else
					return 0;
			}
		};
		
		Collections.sort(keys, comp);
		System.out.println("=====Keyboards Comparator=====");
		for (KeyboardComparator key : keys) {
			System.out.println(key);
		}
	}

}
