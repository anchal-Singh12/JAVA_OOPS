 class Animals{
    void eat(){
        System.out.println("animals are eating...");

    }
    
}
class Dogs extends Animals{
    void bark(){
        System.out.println("dogs are barking...");
    }

}
class Cows extends Animals{
    void givemilk(){
        System.out.println("cows give milk...");
    }
}
public class Hierarchial{
    public static void main(String[] args) {
        Dogs d=new Dogs();
        d.eat();
        d.bark();
        
        Cows c=new Cows();
        c.eat();
        c.givemilk();
    }
}