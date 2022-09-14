package com.velocity.arraylist;

import java.util.Map;

public class HashMap {

	public static void main(String[] args) {
		Map<String, String> map = new java.util.HashMap<String, String>();
		map.put("Chicken", "ChickenTikka");
		map.put("Egg", "MasalaEgg");
		map.put("Fish", "FishCurry");
		map.put("Mutton", "MuttonBiryani");
		
		map.forEach((k, v) ->System.out.println("key: "  +k+ "value:" + v));

	}

}
