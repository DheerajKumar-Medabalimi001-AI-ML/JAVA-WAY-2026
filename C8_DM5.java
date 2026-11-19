import java.util.Scanner;

public class C8_DM5 {
   public static void main(String[] var0) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter your age: ");
      int age = sc.nextInt();
      if (age >= 12) {
         System.out.print("You are eligible to get ticket");
      } else {
         System.out.print("You are not eligible to get ticket");
      }

      sc.close();
   }
}