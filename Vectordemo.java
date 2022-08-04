import java.util.*;
public class Vectordemo {

	public static void main(String[] args) 
	{
		Vector v1=new Vector();
		v1.add(10);
		v1.add(30);
		v1.add(50);
		v1.add(5);
		System.out.println("Initial Vector");
		for(Object e:v1)
		{
			System.out.println(e);
		}
		System.out.println("Capacity: "+v1.capacity());
		System.out.println("size: "+v1.size());
		System.out.println("element at index: "+v1.elementAt(0));;
		v1.ensureCapacity(50);
		System.out.println("Modified Capacity: "+v1.capacity());
		

	}

}
