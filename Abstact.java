 interface Instrument{
     void sound();
    
}
class violin implements Instrument{
     void sound(){
        System.out.println("MAKE SOUND EE");
    }
}
class guitar implements Instrument{
    public void sound(){
        System.out.println("make sound aaa");
    }

}
public class Abstact{
    public static void main(String[] args) {
        Instrument I;
        I=new violin();
        I=new guitar();
        I.sound();
        I.sound();
        
    }
}
