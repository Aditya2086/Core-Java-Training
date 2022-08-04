import java.util.*;
public class ArrayListDemo {

	public static void main(String[] args) 
	{
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(20);
		al.add("Vikash");
		al.add(10.25);
	 
		//int a=(int)al.get(0);
		//System.out.println(a);
		
		al.add(1, 25);
		
		
		ArrayList al2=new ArrayList();
		al2.add("A");
		al2.add("B");
		al2.add("C");
		al2.add("D");
		
		al.addAll(1, al2);
		
		for(Object e1:al)
		{
			System.out.println("First Arraylist: "+e1);
		}
		//al2.clear();
		
		
	System.out.println("Second Arraylist: "+al2);
	
	boolean t=al.contains(10);
	System.out.println(t);
	
	boolean t1=al.containsAll(al2);
			System.out.println(t1);
			
	System.out.println(al2);
	al2.set(1, "F");
	System.out.println("After Replace: "+al2);
	
	int i=al2.indexOf("C");
	System.out.println("Index of C is: "+i);
	
	al2.remove(2);
	System.out.println("After removing single element: "+al2);
	
	ArrayList al3=new ArrayList();
	al3.add("A");
	al3.add("G");
	al3.add("H");
	al3.add("K");
	
	//al2.retainAll(al3);
	//System.out.println(al2);
	
	List al4=al3.subList(1, 2);
	System.out.println(al4);
	System.out.println("Before removeall(al2): "+al2);
	al2.removeAll(al3);
	
	System.out.println(al2);
	

	
		
	}

}
