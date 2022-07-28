import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Input2 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int x = Integer.parseInt(br.readLine());
            System.out.println(x);
        } catch (Exception e) {
            System.out.println("Invalid input");
        }
    }
    
}
