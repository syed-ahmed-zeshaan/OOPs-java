package Polymorphizm;

public class OverLoading {
    static int sum(int a,int b){
        return a+b;
    }
    static int sum(int a,int b,int c){
        return a+b+c;
    }

    public static void main(String[] args) {
        System.out.println(sum(1,2,3));
        System.out.println(sum(1,2));
    }
}
