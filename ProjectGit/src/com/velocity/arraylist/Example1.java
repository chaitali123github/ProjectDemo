package com.velocity.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class Example1 {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(10);
		list.add(30);
		list.add(40);
		
		Iterator<Integer> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
