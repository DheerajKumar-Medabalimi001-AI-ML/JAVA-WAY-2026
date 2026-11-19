import java.util.Scanner;
public class largestnumusingmax {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your 1st integer:");
        int a=sc.nextInt();
        System.out.println("Enter your 2nd integer:");
        int b=sc.nextInt();
        System.out.println("Enter your 33rd integer:");
        int c=sc.nextInt();
        int max;
        if(a>=b){
            if(a>=c){
                max=a;
            }else{
                max=c;  
            }
        }
        else{
            if(b>=c){
                max=b;
            }
            else{
                max=c;
            }
        }
        System.out.println("Largest number is:" +max);
        sc.close();
    }
    
}