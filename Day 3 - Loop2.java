import java.util.Scanner;

public class Loop2 {
    public static void main(String[] args) {
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter nos, -1 for stop ");
        do {
            i=sc.nextInt();
        } while(i!=-1);
        System.out.println("Thank you");
        sc.close();
    }
}
