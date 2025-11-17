import java.util.Scanner;

public class AgeCheck {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age : ");
        int vage = sc.nextInt();
        if(vage>0 && vage<=120) {
            if (vage >= 18) {
                System.out.println("Congratulations!! Buddy you are an adult.");
            } else {
                int agediff = 18 - vage;
                System.out.println("Sorry!! Buddy you have to wait more " + agediff + " years.");
            }
        }
        else{
            System.out.println("Invalid Age Entered.");
        }
        sc.close();
    }
}
