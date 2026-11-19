import java.util.Scanner;
public class largestnum {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your 1st integer");
        int a=sc.nextInt();
        System.out.println("Enter your 2nd integer");
        int b=sc.nextInt();
        System.out.println("Enter your 33rd integer");
        int c=sc.nextInt();
        if(a>=b){
            if(a>=c){
                System.out.println("a is largest number");
            }else{
                System.out.println("c is largest number");   
            }
        }
        else{
            if(b>=c){
                System.out.println("b is largest number");
            }
            else{
                System.out.println("c is largest number");
            }
        }
        sc.close();
    }
    
}
