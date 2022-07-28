package set;

import java.util.HashSet;
import java.util.Iterator;

/**
The HashSet class is an inherent implementation of the hash table data structure.
 The objects that we insert into the HashSet do not guarantee to be inserted in 
 the same order. The objects are inserted based on their hashcode. This class also
  allows the insertion of NULL elements.**/
public class HashSetDemo {

	public static void main(String[] args) {
		
		HashSet<Integer> hs = new HashSet<>();
		hs.add(20);
		hs.add(10);
		hs.add(30);
		hs.add(10);
		hs.add(30);
		
		System.out.println(hs);
		
		Iterator<Integer> iter = hs.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}

	}

}
