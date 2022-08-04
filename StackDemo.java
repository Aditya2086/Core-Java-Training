import java.util.*;
public class StackDemo {

	public static void main(String[] args) {
		Stack st1=new Stack();
		st1.push(10);
		st1.push(20);
		st1.push(30);
		st1.push(40);
		st1.push(50);
		
		System.out.println(st1);
		System.out.println("Top Element: "+st1.peek());
	st1.pop();
	System.out.println("After using Pop: "+st1);
	System.out.println("Initial capcity: "+st1.capacity());
		st1.trimToSize();
		System.out.println("Trimed capcity: "+st1.capacity());

	}

}
