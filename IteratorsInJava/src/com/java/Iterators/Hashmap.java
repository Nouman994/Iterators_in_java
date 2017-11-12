package com.java.Iterators;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

	
public class Hashmap {
	
	public static void HashMethod() {
	    Map<Integer, String> map1 = new HashMap<>();
	    
    	map1.put(1, "Islamabad");
    	map1.put(3, "Lahore");
    	map1.put(2, "karachi");
    	
    	// loop through a hash map using Iterator 
    	Set<Integer> keys = map1.keySet();
    	Iterator<Integer> Iterator = keys.iterator();
    	while (Iterator.hasNext()) {
    		int pos = Iterator.next();
    		System.out.println("The value of key " + pos + " is " + map1.get(pos) );
    		
    	}
	}


    
	

}

