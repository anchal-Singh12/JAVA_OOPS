 class Student {
    static String college="ABC COLLEGE";
    String name;
    Student(String n){
        name=n;
    }
    void show(){
        System.out.println(name +"-" + college);
    }
 }

public class Detail{
    public static void main(String[] args) {
        Student s1=new Student("Ravi");
        Student s2=new Student("Mohan");
        s1.show();
        s2.show();
    }
 }