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
