package com.apple.com;

import java.util.LinkedList;

public class ReverseLinkedList {
	
	// Reversing linkedlist 
	public static LinkedList reverse(LinkedList inList){
		LinkedList reverseList = new LinkedList();
		while(inList !=null && !inList.isEmpty()){
			reverseList.addLast(inList.removeLast());
		}
		return reverseList;
		
	}
 
	public static void main(String[] args) {
		
		// Creating a linked list
		LinkedList inList = new LinkedList();
		inList.add(1);
		inList.add(2);
		inList.add(3);
		inList.add(4);
		inList.add(5);
		inList.add(6);
		System.out.println("in list : " +inList);
		LinkedList outList = ReverseLinkedList.reverse(inList);
		System.out.println("out list : " +outList);
		
	}
}
