package list;

import java.util.Iterator;
import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack<Float> x = new Stack<>();
		x.push(3.5f);
		x.push(2.5f);
		x.push(1.5f);
		x.push(0.5f);
		System.out.print(x.peek()+ " ");
		x.pop();
		
		Iterator<Float> itr = x.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
