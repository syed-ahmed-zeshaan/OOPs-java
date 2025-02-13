package Constructors_and_keywords;

public class Program7 {
    String name;

    Program7(String name){
        this.name=name;
    }

    protected void finalize() throws Throwable{
        System.out.println("object destroyed paaji");
    }

    public static void main(String[] args) {
        Program7 obj;

        for(int i=0;i<10;i++){
            obj=new Program7("Hungry");
            System.gc();  //we arent ordering the JVM to destroy the object, but rather suggesting the JVM to do it.It is the decision of JVM to
            //destroy objects or not
        }
    }
    
}
