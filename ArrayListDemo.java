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
