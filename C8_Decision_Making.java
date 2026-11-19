import java.util.Scanner;

public class C8_Decision_Making { 
    public static void main(String[] args) { 
        int age; 
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter your age: "); 
        age = sc.nextInt(); 
        if (age >= 18) { 
            System.out.print("You are eligible to vote"); 
        } else { 
            System.out.print("You are not eligible to vote"); 
        } 
        sc.close(); 
    } 
}
