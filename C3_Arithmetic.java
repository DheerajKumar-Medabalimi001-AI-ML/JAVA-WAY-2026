import java.util.Scanner;
public class C3_Arithmetic {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the integers:");
        int num1= input.nextInt();
        int num2= input.nextInt();
        int sum=num1+num2;
        System.out.println("Sum of two numbers given by user is:"+sum);
        int sub=num1-num2;
        System.out.println("Subtraction of two numbers given by user is:" +sub);
        int mul=num1*num2;
        System.out.println("Multiplication of two numbers given by user is:" +mul);
        int div=num1/num2;
        System.out.println("Division of two numbers given by user is:" +div);
        int mod=num1%num2;
        System.out.println("Remainder of two numbers given by user is:" +mod);
    
        input.close();
    }
    
}
