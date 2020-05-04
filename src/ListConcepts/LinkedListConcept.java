package ListConcepts;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {
		
		LinkedList<String> ll = new LinkedList<String>();
		
		//add
		ll.add("test");
		ll.add("QTP");
		ll.add("Selenium");
		ll.add("RPA");
		ll.add("RFT");
		System.out.println("Content of linkedlist:"+ ll);
		
		//addfirst:
		ll.addFirst("Yogesh");
		
		//addlast:
		ll.addLast("Thakur");
		
		System.out.println("Content of linkedlist:"+ ll);
		
		//get:
		System.out.println(ll.get(0));
		System.out.println(ll.get(1));
		
		//set:
		ll.set(0, "Balli");
		System.out.println(ll.get(0));
		
		//remove: remove first and last element
		ll.removeFirst();
		ll.removeLast();
		System.out.println("Content of linkedlist:"+ ll);
		
		
		//remove: from a specific position
		ll.remove(2);
		System.out.println("Content of linkedlist:"+ ll);
		
		//how to print all the values of linked list:
		
		//for loop:
		System.out.println("**********using for loop");
		for (int n=0; n<ll.size(); n++) {
			System.out.println(ll.get(n));
		}
				
		
		//advanced for loop or For each loop
		System.out.println("**********using Advance for loop");
		for(String str: ll) {
			System.out.println(str);
		}
		
				
		//iterator
		System.out.println("**********using iterator");
		Iterator<String> it = ll.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	
		
		//while loop
		System.out.println("**********using While loop");
		int num=0;
		while(ll.size()>num)
		{
			System.out.println(ll.get(num));
			num++;
		}
			}

}
