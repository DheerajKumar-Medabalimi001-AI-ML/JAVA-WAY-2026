import java.util.Scanner;
public class  C3_Assigment {
    public static void main (String[] args) {
        System.out.print("Enter the integers : ");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.println("-----ASSIGNMENT OPERATIONS-----");
        System.out.println("Adding of two integers : "+(a+=b));
        System.out.println("Subtraction of two integers : "+(a-=b));
        System.out.println("Multiplicaton of two integers : "+(a*=b));
        input.close();
    }

}