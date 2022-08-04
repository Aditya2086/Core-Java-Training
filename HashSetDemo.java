import java.util.*;
public class HashSetDemo {

	public static void main(String[] args) 
	{
		HashSet hs1=new HashSet();
		
		hs1.add(10);
		hs1.add(15);
		hs1.add(12);
		hs1.add(11);
		hs1.add(11);
		System.out.println(hs1);
		
   HashSet hs2=new HashSet();
		
		hs2.add(10);
		hs2.add(13);
		hs2.add(12);
		hs2.add(5);
		//hs1.addAll(hs2);
		//System.out.println("Union Operation");
		//System.out.println(hs1);
		//hs1.retainAll(hs2);
		//System.out.println("Intersection Operation");
		//System.out.println(hs1);
		
		hs1.removeAll(hs2);
		System.out.println("Difference of Set Operation");
		System.out.println(hs1);
		
		
		

	}

}
