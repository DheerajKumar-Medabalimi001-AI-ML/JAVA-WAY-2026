public class C7_explicit {
    public static void main (String[] args) {
        int a=1000;
        byte b = (byte) a;
        short c = (short) a;
        float d = (float) a;
        double e = (double) a;
        System.out.println("value of var a in byte is : " + b);
        System.out.println("value of var a in short is : " + c);
        System.out.println("value of var a in float is : " + d);
        System.out.println("value of var a in double is : " + e);
    }
}