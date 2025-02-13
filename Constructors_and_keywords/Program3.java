package Constructors_and_keywords;//remove this before execution of your program in your editor

public class Program3{
    public static void main(String[] args){

        class Student{
            int rno;
            String name;
            float marks;
            
            void display(){
                System.out.println("Rollno="+this.rno+"\nName="+ this.name+"\nmarks="+this.marks);

            }
        }


        Student s=new Student();
        s.display();
        //the compiler itself initialises the attributes to the default values of its datatype using implicit constructor
    }
    
}
