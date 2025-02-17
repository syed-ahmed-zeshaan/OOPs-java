package Polymorphizm;

class Shape{
    void area(){
        System.out.println("Area of a shape is space it takes");
    }
}

class Circle extends Shape{
    @Override
    void area(){
        System.out.println("pi*r*r");
    }
}

public class OverRiding {
    public static void main(String[] args) {
        
        Shape obj=new Circle();

        obj.area();

    }
}
