class A1{
    void show(){
        System.out.println("It's our A1 show function...");
    }

}
class A2 extends A1{
    void show(){
        System.err.println("It's our A2 show function...");
        super.show();
       
    }
}
public class Super{
    public static void main(String[] args) {
        A2 obj=new A2();
        obj.show();
       
        
    }

}