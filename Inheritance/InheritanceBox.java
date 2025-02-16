package Inheritance;

class Box {
        int l,b,h;
        
        Box(int l,int b,int h){
            this.l=l;
            this.b=b;
            this.h=h;
        }

        Box(int a){
            this(a,a,a);
        }

        Box(){
            this(-1,-1,-1);
        }

        Box(Box old){
            this(old.l,old.b,old.h);
        }

        void display(){
            System.out.println("Box:-"+this.l+" "+this.b+" "+this.h);
        }}

class BoxWeight extends Box {

        int w;
    
        BoxWeight(int l,int b,int h,int w){
           super(l,b,h);
           this.w=w;
        }
    
        void display(){
            System.out.println("BoxWeight:-"+this.l+" "+this.b+" "+this.h+" "+this.w);
        }
    
        public static void main(String[] args) {
            BoxWeight box3=new BoxWeight(5,6,8,9);
            box3.display();
        }
        
    }

public class InheritanceBox {
    public static void main(String[] args) {
        Box box1=new Box(1,5,3);
        box1.display();
        Box box2=new Box(box1);
        box2.display();

        BoxWeight box3=new BoxWeight(5,6,8,9);
        box3.display();
    }
}
