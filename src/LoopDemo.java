import java.util.Scanner;

public class LoopDemo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Loop starting point :");
        long vstart = sc.nextLong();
        System.out.println("Enter Loop Ending point :");
        long vend = sc.nextLong();
        if(vend < vstart){
            System.out.println("Starting number cannot be greater than the Ending number.");
        }
        else {
            for (long l = vstart; l <= vend; l++) {
                System.out.println(l);
            }
        }
    }
}
