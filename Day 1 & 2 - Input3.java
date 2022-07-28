import java.io.Console;

public class Input3 {
    public static void main(String[] args) {
        Console c = System.console();
        System.out.print("Enter your username: ");
        String uname = c.readLine();
        System.out.println("Enter your password: ");
        char[] ch = c.readPassword();
        System.out.println("Username: " + uname);
        System.out.print("Password: ");
        System.out.println(ch);
    }
}
