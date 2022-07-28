public class PerfectSq {
    public static void main(String[] args) {
        int num = 49;
        int i = 1;
        boolean flag = true;
        while(i*i!=num) {
            if(i*i>num) {
                flag = false;
                break;
            }
            i++;
        }
        if(flag) {
            System.out.println("Perfect square");
        } else {
            System.out.println("Not perfect square");

        }
    }
}
