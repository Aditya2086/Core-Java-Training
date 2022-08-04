import java.util.*;
public class LinkedListDemo {

	public static void main(String[] args) 
	{
		LinkedList l1=new LinkedList();
		
		l1.add(100);
		l1.add(20);
		l1.add(30);
		l1.add(40);
		l1.add(50);
		System.out.println("Initial LinkedList:  ");
		for(Object e:l1)
		{
			System.out.println(e);
		}
		l1.addFirst(5);
		
		System.out.println("After using AddFirst :  ");
		for(Object e:l1)
		{
			System.out.println(e);
		}
		
		l1.addLast(70);
		System.out.println("After using AddLast :  ");
		for(Object e:l1)
		{
			System.out.println(e);
		}
		Object e1=l1.getFirst();
		System.out.println("First Element: "+e1);
		
		Object e2=l1.getLast();
		System.out.println("Last Element: "+e2);
		
		System.out.println(l1.peek());
		System.out.println(l1.poll());
		System.out.println("After using Poll :  ");
		for(Object e:l1)
		{
			System.out.println(e);
		}
		
		l1.sort(Comparator.naturalOrder());
		System.out.println("After using sort :  ");
		for(Object e:l1)
		{
			System.out.println(e);
		}
   
	}

}
