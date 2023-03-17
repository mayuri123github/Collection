package com.velocity.collections;


import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<Integer> numberList=new LinkedList<Integer>();
		numberList.add(2);
		numberList.add(4);
		numberList.add(6);
		
		Iterator<Integer> itr=numberList.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
		}
		
		for(Integer num:numberList) {
			System.out.println(num);
		}
		
	}

}
