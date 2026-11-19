public class C6_LogicalOprts{
    public static void main (String[]  args){
        int a = 10;
        int b = 15;
        int c =5;
        if((a<b)&&(a>c)){
            System.out.println("b is larger");
        }
        else if((b<a)&&(b>c)) {
            System.out.print("a is larger");
        }
        else{
            System.out.print("c is larger");
        }
    }
}