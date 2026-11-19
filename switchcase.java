import java.util.Scanner;
public class switchcase {
    public static void main(String[] args){
        System.out.println("Press 1 for addition");
        System.out.println("Press 2 for subtraction");
        System.out.println("Press 3 for multiplication");
        System.out.println("Enter your numbers");
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Enter your choice");
        int ch=sc.nextInt();

        switch(ch){
            case 1:
                System.out.println("Addition: "+ (a+b));
                break;
            case 2:
                System.out.println("Subtraction: "+ (a-b));
                break;
            case 3:
                System.out.println("Multiplication: "+ (a*b));
                break;
            default:
                System.out.println("INVALID INPUT");
        }
        sc.close();    
    }   
}
