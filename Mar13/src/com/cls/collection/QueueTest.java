package com.cls.collection;

import java.util.Iterator;
import java.util.PriorityQueue;

public class QueueTest {
public static void main(String[] args) {
	PriorityQueue<String> pq= new PriorityQueue<>();
	pq.add("Arivu");
	pq.add("selvam");
	pq.add("Beulah");
	pq.add("Avniel");
	pq.add("Caleb");
	pq.poll();
	Iterator<String> itr =pq.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	
	};
}
}
