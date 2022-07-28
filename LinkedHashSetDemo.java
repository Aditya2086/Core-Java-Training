package set;

import java.util.LinkedHashSet;

/**
 * A LinkedHashSet is very similar to a HashSet. The difference is that this uses
 * a doubly linked list to store the data and retains the ordering of the elements. **/
public class LinkedHashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<String> lhs = new LinkedHashSet<String>();
		lhs.add("abc");
		lhs.add("bcd");
		lhs.add("efg");
		lhs.add("abc");
		lhs.add("geh");
		System.out.println(lhs);
		
		
	}

}
