package Constructors_and_keywords;

public class Program5 {
    public static void main(String[] args){

        class Student{
            int rno;
            String name;
            float marks;
            
            Student(int rno,String name,float marks){
                this.rno=rno;
                this.name=name;
                this.marks=marks;
                        //------
                         //these "marks" are from the arguments

            }
            //this method will be initialised as soon as the object is created and the values to the attributes will be allocated

            void display(){
                System.out.println("Rollno="+this.rno+"\nName="+ this.name+"\nmarks="+this.marks);

            }
        }


        Student s=new Student(65,"idk",65);
        s.display();
        //the
}}
