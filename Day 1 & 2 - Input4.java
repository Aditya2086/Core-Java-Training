//run on cmd prompt using javac and java separately
public class Input4 {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Please supply atleast one number");
        } else {
            System.out.println(args[0]);
            System.out.println(args[1]);
        }
    }
}
