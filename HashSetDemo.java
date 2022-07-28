import java.util.HashSet;
import java.util.Iterator;

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
