class Parent{
    void show(){
        System.out.println("I am parent");
    }
    
}
class Child extends Parent{
    void display(){
        System.out.println("I am parent's child");
    }
}
public class Single{
    public static void main(String[] args) {
       Child obj=new Child();
       obj.display();
       obj.show();
    }
}
