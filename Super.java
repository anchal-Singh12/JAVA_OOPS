 class A {
    int x=20;
    
}
class B extends A{
    int x=29;
    void show(){
        System.out.println(x);
        System.out.println(super.x);
    }
}
public class Super{
    public static void main(String[] args) {
        B r=new B();
        r.show();
    }
}
