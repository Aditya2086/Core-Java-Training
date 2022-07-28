import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<String> lhs = new LinkedHashSet<String>();
		lhs.add("abc");
		lhs.add("bcd");
		lhs.add("efg");
		lhs.add("abc");
		lhs.add("geh");
		System.out.println(lhs);
		
		
	}

}
