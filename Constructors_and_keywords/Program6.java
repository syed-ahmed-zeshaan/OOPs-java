package Constructors_and_keywords;

public class Program6 {
    public static void main(String[] args){

        class Student{
            int rno;
            String name;
            float marks;
            
            Student(){
    
                this(13,"Zee",56);
                /*
                 * instead of 
                    this.rno=13;
                    this.name="Zee";
                    this.marks=56;

                    use this(args); to call another constructor.
                 */
            }
            
            Student(int rno,String name,float marks){
                this.rno=rno;
                this.name=name;
                this.marks=marks;

            }
            void display(){
                System.out.println("Rollno="+this.rno+"\nName="+ this.name+"\nmarks="+this.marks);

            }
        }


        Student s=new Student();//calls 1st constructor
        s.display();

        Student s1=new Student(66,"idfc",66); //calls 2nd constructor
        s1.display();
       
    }
    
}
