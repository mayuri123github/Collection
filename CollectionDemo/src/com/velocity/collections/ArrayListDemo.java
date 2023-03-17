package com.velocity.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList<String> list=new ArrayList<String>();
		list.add("pune");
		list.add("mumbai");
		list.add("bangalore");
		
		Iterator<String> itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
		}
		
		for(String name:list) {
			System.out.println(name);
		}
		
		
		
	}

}
