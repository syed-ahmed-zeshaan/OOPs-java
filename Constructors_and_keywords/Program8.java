package Constructors_and_keywords;

public class Program8 {
    static int a=4;
    static int b;
    static void random(int x){
        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println("x="+x);
    }
    static{
        System.out.println("Static block initialised");
        b=a*4;
    }
    public static void main(String[] args) {
        random(42);
    }
    
}
