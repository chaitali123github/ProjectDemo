package com.velocity.arraylist;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class Map {

	public static void main(String[] args) {
	LinkedHashMap<String, Integer> map = new LinkedHashMap<String, Integer>();
	map.put("Chaitali", 1000);
	map.put("Rahul", 2000);
	map.put("Nayna", 3000);
	map.put("Ashutosh", 4000);
	
	Set<String> set = map.keySet();
	Iterator<String> itr = set.iterator();
	while (itr.hasNext()) {
	
	    String key = itr.next();
	    System.out.println("keys: " + key);
	    System.out.println("Values: " + map.get(key));
	}
	}

}
