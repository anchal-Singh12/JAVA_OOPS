class Student {
    int a;
    String name;
    double marks;
    Student(){
        a=0;
        name= "ac";
        marks=45.00;
    }
    Student(int x, String y){
        a=x;
        name=y;

    }
    Student(double z){
        marks=z;
    }
    
}
public class test{
    public static void main(String[] args) {
        Student s1=new Student();
        Student s2=new Student(12,"anchal");
        Student s3=new Student(12);
        System.out.println(s1.a+s1.name+s1.marks);
        System.out.println(s2.a+s2.name);
        System.out.println(s3.marks);

    }
}
