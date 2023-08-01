package com.lumen.maps;


import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class StateDemo {
	public static void main(String[] args) {
		Map<String,List<String>> hashMap=new HashMap<>();
		hashMap.put("Karnataka", Arrays.asList("Banglore","Mysore","Mangalore"));
		hashMap.put("Tamilnadu", Arrays.asList("Chennai","Coimbatore","Vellore"));
		hashMap.put("Andhra Pradesh", Arrays.asList("Anantapur","Vijayawada","Vizag"));
		hashMap.put("Uttar Pradesh", Arrays.asList("Lucknow","Kanpur","Varanasi"));
		
		System.out.println(hashMap.get("Andhra Pradesh"));
		System.out.println(hashMap.get("Karnataka"));
		
		System.out.println();
		
		Set<String> keys=hashMap.keySet();
		System.out.println(keys);
		
		for(String key:keys)
			System.out.println(hashMap.get(key));
		
	}

}
