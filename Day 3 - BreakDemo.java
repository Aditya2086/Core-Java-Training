import java.util.Scanner;

public class BreakDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        while (true) {
            i = sc.nextInt();
            if (i == -1)
                break;
        }
        sc.close();
    }
}
