import java.util.Scanner;

public class Vowel {
    public static void main(String[] args) {
        char ch;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an alphabet: ");
        ch = sc.next().charAt(0);
        sc.close();
        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("this is a vowel");
                break;
            default:
                System.out.println("this is a consonant");
        }
    }
}
