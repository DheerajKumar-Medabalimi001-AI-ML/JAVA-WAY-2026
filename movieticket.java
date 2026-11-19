import java.util.Scanner;
public class movieticket {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int age=sc.nextInt();
        System.out.println("Have studentid?");
        boolean s_id=sc.nextBoolean();
        if(age<12){
            System.out.println("Ticket price is $5");
        }else if(age>=65) {
            System.out.println("Ticket price is $7");
        }
        else {
            if(age>12 && s_id ){
                System.out.println("Ticket price is $10");
            }
            else{
                System.out.println("Ticket price is $12");
            }
        }
        sc.close();

    }
}
