package sortedset;

import java.util.TreeSet;
/**
 * TreeSet implements the SortedSet interface. So, duplicate values are not allowed.
Objects in a TreeSet are stored in a sorted and ascending order.
TreeSet does not preserve the insertion order of elements but elements are sorted by keys.**/
public class TreeSetDemo {

	public static void main(String[] args) {
		
		TreeSet<Integer> ts = new TreeSet<Integer>();

		ts.add(30);
		ts.add(40);
		ts.add(10);
		ts.add(50);
		
		
		System.out.println(ts);
	}

}
