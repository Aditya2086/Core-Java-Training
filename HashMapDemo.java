import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		Map<Integer,String> hm = new HashMap<>();
		
		hm.put(1, "Ajay");
		hm.put(2, "Vijay");
		hm.put(3, "Sujay");
		hm.put(4, "Dhananjay");
		
		System.out.println(hm.get(3));
		
		for(Map.Entry<Integer, String> e : hm.entrySet()) {
			System.out.println(e.getKey()+ " : " +e.getValue());
		}
		
	}

}
