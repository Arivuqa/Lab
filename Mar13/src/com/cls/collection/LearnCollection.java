package com.cls.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class LearnCollection {
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<>();
		al.add("Arivu");
		al.add("selvam");
		al.add("Beulah");
		al.add("Avniel");
		al.add("Caleb");
		al.add("Caleb");
		
//		LinkedList<String> ll=new LinkedList<>();
//		ll.add("Arivu");
//		ll.add("selvam");
//		ll.add("Beulah");
//		ll.add("Avniel");
//		ll.add("Caleb");
//		ll.add("Caleb");
		
		HashSet<String> hs= new HashSet<>();
		hs.addAll(al);
		
//		hs.add("Arivu");
//		hs.add("selvam");
//		hs.add("Beulah");
//		hs.add("Avniel");
//		hs.add("Caleb");
//		hs.add("Caleb");
		
		Iterator<String> itr =hs.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		
		};
	}
		
	}


