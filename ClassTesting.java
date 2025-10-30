//USE OF STATIC CLASS.

class Outer{
    static int data=30;
    static class Inner{
        void msg(){
            System.out.println("data is "+data);

        }
    }

}
public class ClassTesting{
    public static void main(String[] args) {
        Outer.Inner obj=new Outer.Inner();
        obj.msg();
    }
}