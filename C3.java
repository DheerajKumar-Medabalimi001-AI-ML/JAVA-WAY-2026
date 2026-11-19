import java.util.Scanner;
public class C3 {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter your first name : ");
        String var_1 = Input.next();
        System.out.print("Enter your second name : ");
        String var_2 = Input.next();
        System.out.print("Your full name is : " +(var_1+' '+var_2));
        Input.close();
    }
}        