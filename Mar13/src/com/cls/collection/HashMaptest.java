package com.cls.collection;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMaptest {
public static void main(String[] args) {
	HashMap<Integer, String> hm = new HashMap<Integer, String>();
	hm.put(1, "Ios");
	hm.put(2, "Andoid");
	hm.put(3, "Windows");
	hm.put(4, "Linux");

	for(Entry<Integer, String> m : hm.entrySet())
	{
	System.out.println("Key is "+m.getKey()+ " value is " +m.getValue());
	}
}
}
