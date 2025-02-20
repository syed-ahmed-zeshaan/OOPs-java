package Encapsulation;

class Example{
    private int n;

    public void set(int n){
        this.n=n;
    }

    public int get(){
        return n;
    }
}

public class GetterAndSetter{
    public static void main(String[] args) {
        Example a=new Example();

        a.set(45);//setting value of n to 45.

         // int b=a.n; error, as n is decalred to private and you are tring to access it in another class

         int b=a.get();//Valid, because you are tring to access n through a method that exists in the same class as it

         System.out.println(b);
        
    }
}