import java.util.Scanner;

public class Larger2 {
    public static void main(String[] args) {
        int x,y;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an year: ");
        x = sc.nextInt();
        y = sc.nextInt();
        System.out.println(x>=y?x:y);
        sc.close();
    }
}
