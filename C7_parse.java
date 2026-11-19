import java.util.Scanner;
public class C7_parse {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your value : ");
        String text_int = input.nextLine();
        int real_number = Integer.parseInt(text_int);
        System.out.print("This is converted value: " + real_number);

        input.close();

        
    }
}
