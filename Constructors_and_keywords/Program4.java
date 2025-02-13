package Constructors_and_keywords;

public class Program4 {
    public static void main(String[] args){

        class Student{
            int rno;
            String name;
            float marks;
            
            Student(){
                this.rno=13;
                this.name="Zee";
                this.marks=56;
            }
            //this method will be initialised as soon as the object is created and the values to the attributes will be allocated

            void display(){
                System.out.println("Rollno="+this.rno+"\nName="+ this.name+"\nmarks="+this.marks);

            }
        }


        Student s=new Student();
        s.display();
        //the compiler itself initialises the attributes to the default values of its datatype using implicit constructor
    }
    
    
}
