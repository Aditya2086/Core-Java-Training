package list;

/**The ArrayList class implements the List interface. 
 * It uses a dynamic array to store the duplicate element of different data types. 
 * The ArrayList class maintains the insertion order and is non-synchronized. 
 * The elements stored in the ArrayList class can be randomly accessed */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList <String> al = new ArrayList<>();
        al.add("abc");
        al.add("123");

        String[] fruits = {"apple", "orange", "banana"};

        al.addAll(Arrays.asList(fruits));

        Iterator<String> it = al.iterator();

        while(it.hasNext()) {
            System.out.println(it.next());
        }
        
    }
}
