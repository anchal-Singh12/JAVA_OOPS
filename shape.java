abstract class Shape{
    abstract double area();
}
class Circle extends Shape{
    private double radius;
    Circle(double radius){
        this.radius=radius;

    }
    double area(){
        return 3.14*radius*radius;
    }
}
class retangle extends Shape{
    private double length;
    private double breadth;
    retangle(double length,double breadth){
        this.length=length;
        this.breadth=breadth;

    }
    double area(){
        return length*breadth;
    }
}
public class Main{
    public static void main(String[] args) {
         Shape c;
         c =new Circle(23.8);
         c=new retangle(23.5,34.9);
        
        System.out.println(c.area());
        System.out.println(c.area());
        
    }
}