package Abstraction;

interface Vehicle{
        void start();//abstract method

        default void stop(){//default method
            System.out.println("Stopping...");
        }
}

class Car implements Vehicle{
    public void start(){
            System.out.println("Starting...");
        }
}

public class InterfacesDemo {
    public static void main(String[] args) {
        Vehicle car=new Car();
        car.start();
        car.stop();
    }
}
//impliment using
//javac -d . Abstraction/InterfacesDemo.java
// java Abstraction.InterfacesDemo
