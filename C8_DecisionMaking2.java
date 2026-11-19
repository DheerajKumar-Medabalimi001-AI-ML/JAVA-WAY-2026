import java.util.Scanner; 

public class C8_DecisionMaking2 { 
    public static void main(String[] args) { 
        int marks;
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter Students Marks: ");
        marks=sc.nextInt();
        if(marks>=90){
            System.out.print("Grade is A+");
        }
        else if(marks>=80 && marks<90){
            System.out.print("Grade is A");
        }
         else if(marks>=70 && marks<80){
            System.out.print("Grade is B+");
        }
         else if(marks>=60 && marks<70){
            System.out.print("Grade is B");
        }
         else if(marks>=50 && marks<60){
            System.out.print("Grade is c");
        }
        else if(marks>=40 && marks<50){
            System.out.print("Grade is c");
        }
        else {
            System.out.print("Student is failed in the Exam");
        }
        sc.close();
    }
}