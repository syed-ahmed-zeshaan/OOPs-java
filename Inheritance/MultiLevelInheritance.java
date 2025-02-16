package Inheritance;

class Grandparent {
    void method1() {
        System.out.println("Grandparent class");
    }
}
class Parent extends Grandparent {
    void method2() {
        System.out.println("Parent class");
    }
}
class Child extends Parent {
    void method3() {
        System.out.println("Child class");
    }
}
public class MultiLevelInheritance {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.method1(); // Grandparent class method
        obj.method2(); // Parent class method
        obj.method3(); // Child class method
    }
}