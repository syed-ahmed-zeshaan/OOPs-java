public class Program2 {
    public static void main(String[] args){

        class Student{
            int rno=13;
            String name="Zeshaan1";
            float marks=55;
            /* initialising these variables to a value.Each All Objects of the class will share these variablesin common at one place*/
           

            void display(){
                System.out.println("Rollno="+this.rno+"\nName="+ this.name+"\nmarks="+this.marks);
                System.out.println("-------------------------");

            }
        }

       Student[] s=new Student[5];//creating an array of objects of type student.these are mere references to the objects.we need to create objects

       for (int i = 0; i < 5; i++) {
        s[i]=new Student();//creating objects
}

       for (int i = 0; i < 5; i++) {
        System.out.println(i);
        s[i].display();//didnt initialise object to any value, yet all objects display same results
    }

    s[1].name="Samay";
    s[1].rno=7;
    s[1].marks=0;
            //yes,these variables can be modified by an object, but the changes will be limited only to that object
    s[1].display();
    


        
    }

}
