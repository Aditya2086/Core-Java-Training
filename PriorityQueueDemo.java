import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		
		PriorityQueue<String> pq = new PriorityQueue<String>();
		pq.add("Python");
		pq.add("CPP");
		pq.add("Java");
		pq.add("CSharp");
		
		
		System.out.println(pq);
		System.out.println(pq.peek());
	}

}
