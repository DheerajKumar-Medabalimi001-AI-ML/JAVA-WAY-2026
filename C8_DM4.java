import java.util.Scanner;
public class C8_DM4 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int age;
        double weight;
        System.out.println("Enter your Age");
        age=sc.nextInt();
        System.out.println("Enter your weight");
        weight=sc.nextDouble();
        if(age>=18){
            if(weight>50.0){
                System.out.println("Eligible to donate blood");
            }
        }
        else{
            System.out.println("Not eligible to donate blood");
        }
        sc.close();
    }
}