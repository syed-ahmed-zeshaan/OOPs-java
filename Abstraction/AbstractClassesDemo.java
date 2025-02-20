package Abstraction;

abstract class Animal{
    int weight;
    Animal(){
        this.weight=10;//constructors of abstarct classes are valid :))
    }
    abstract void sound();
    void move(){ //general methods/concenrete methods can be used in an abstarct class if implementation is provided :))
        System.out.println("animals move");
    }

    static void move2(){ //static concrete methods can be implemented :))
        System.out.println("animals move");
    }
}

class Dog extends Animal{
    void sound(){
        System.out.println("Dog Barks");
    }
}

// final abstract class Cat{
//     void sound(){
//         System.out.println("Cat Meows");
//     }
// }
//class must either be abstarct or final  :))

public class AbstractClassesDemo {
   public static void main(String[] args) {
    Animal obj=new Dog();
    // Animal obj2=new Animal(); will pop an error as abstract classes cant be instantiated. :))
    obj.sound();
    System.out.println(obj.weight);
    obj.move();
    Animal.move2();
   }
}
