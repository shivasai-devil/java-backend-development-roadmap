import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first number : ");
        long a = sc.nextLong();
        System.out.println("Enter your Second number : ");
        long b = sc.nextLong();
        long Vsum = a + b;
        System.out.println("Sum of two numbers is : " + Vsum);
        sc.close();
    }
}
