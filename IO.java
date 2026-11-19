import java.util.Scanner;
public class IO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String var_1 = sc.next();
        System.out.print("Your name is : " + var_1);
        sc.close();


    }
}
