import java.util.ArrayDeque;

public class DequeDemo {

	public static void main(String[] args) {
		
		ArrayDeque<Integer> dq = new ArrayDeque<Integer>();
		dq.add(10);
		dq.add(20);
		dq.add(30);
		dq.add(40);
		dq.add(50);
		dq.add(60);
		System.out.println(dq);
		dq.clear();
		dq.addFirst(23);
		dq.addFirst(24);
		dq.addLast(25);
		dq.addLast(30);
		
		System.out.println(dq);
	}

}
