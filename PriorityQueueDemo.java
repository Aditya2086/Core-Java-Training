package queue;

import java.util.PriorityQueue;
/**
 * A PriorityQueue is used when the objects are supposed to be processed
 *  based on the priority. It is known that a queue follows the First-In-First-Out algorithm,
 *   but sometimes the elements of the queue are needed to be processed according
 *    to the priority and this class is used in these cases. The PriorityQueue is
 *     based on the priority heap. The elements of the priority queue are ordered
 *      according to the natural ordering, or by a Comparator provided at queue 
 *      construction time, depending on which constructor is used. **/
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
