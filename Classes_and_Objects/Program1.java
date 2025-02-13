
//-----------------------------------------PROGRAM TO DEMONSTRATE INSTANCE VARIABLES------------------------------------

class Program1{
    //outer class
        
        public static void main(String[] args){

            class Student{
                /*
                 inner classes are generally declared inside psvm.If you want to declare it outside psvm,
                    use "static" keyword.
                    static class Student{...}
                */
                int rno;
                String name;
                float marks;
                /*not initialising these variables to any value.Each unique Object is free to initialise 
                its own set of unique variables*/
    
                void display(){
                    System.out.println("Rollno="+this.rno+"\nName="+ this.name+"\nmarks="+this.marks);

                    /*
                     * THIS KEYWORD:-
                     * Used to refer the object from within the class
                     * Analogue to "self" keyword in python
                     */
                }
            }


            Student s=new Student();//creating an object of the class "Student"
            s.rno=13;//variables initialsed are unique to the object named "s" not the class "Student",hence these are instance variables.
            s.name="Zeshaan";
            s.marks=55;
            s.display();
        }
}