import java.util.*;
public class LinkedHashetDemo {

	public static void main(String[] args) 
	{
		LinkedHashSet ls1=new LinkedHashSet ();
		ls1.add(2);
		ls1.add(1);
		ls1.add(4);
		ls1.add(3);
		ls1.add(3);
		System.out.println("LinkedHashSet:  "+ls1);
		
		
		TreeSet ls2=new TreeSet ();
		ls2.add(2);
		ls2.add(1);
		ls2.add(4);
		ls2.add(3);
		ls2.add(3);
		System.out.println("TreeSet:  "+ls2);

	}

}
