import java.util.Scanner;
//Java14 method of writing a switch case
public class SwitchNew {
    public static void main(String[] args) {
        System.out.println("Think of a number!!!");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        sc.close();
        String str = switch(choice) {
            case 0,1,2,3,4,5 -> "Hello";
            case 6,7,8,9 -> "hi";
            default -> "bye";
        };
        System.out.println(str);
        

    }
}
