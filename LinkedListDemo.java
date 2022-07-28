package list;

/**LinkedList implements the Collection interface. 
 * It uses a doubly linked list internally to store the elements. 
 * It can store the duplicate elements. 
 * It maintains the insertion order and is not synchronized. 
 * In LinkedList, the manipulation is fast because no shifting is required.**/

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<>();
		ll.add("qwe");
		ll.addFirst("123");
		ll.addLast("456");
		ll.add(1, "cvb");
		Iterator<String> itr = ll.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
	}
}
