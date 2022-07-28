import java.util.Scanner;

public class Larger2 {
    public static void main(String[] args) {
        int x,y,z;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an year: ");
        x = sc.nextInt();
        y = sc.nextInt();
        z = sc.nextInt();
        if(x>y) {
            if(x>z) {
                System.out.println(x+" is largest");
            } else {
                System.out.println(z+" is largest");
            }
        } else {
            if(y>z) {
                System.out.println(y+" is largest");
            } else {
                System.out.println(z+ "is largest");
            }
        }
        sc.close();
    }
}
