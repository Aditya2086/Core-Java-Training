package map;
/**
 * HashMap provides the basic implementation of the Map interface of Java. 
 * It stores the data in (Key, Value) pairs. To access a value in a HashMap, 
 * we must know its key. HashMap uses a technique called Hashing. Hashing is a 
 * technique of converting a large String to a small String that represents the 
 * same String so that the indexing and search operations are faster. 
 * HashSet also uses HashMap internally.**/
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
