import java.util.Scanner;
public class C8_DM3 {
    public static void main (String[] args){
        int number;
        Scanner sc = new Scanner(System.in);
        number=sc.nextInt();
        if(number>0){
            System.out.print("Entered number is positive");
        }
        else if (number<0) {
            System.out.print("Entered number is negative");
        }
        else {
            System.out.print("Entered number is Zero");
        }
        sc.close();
    }
    
}
