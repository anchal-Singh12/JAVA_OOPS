class First {
    int add(int x,int y){
        return x+y;
    }
    
    
}
class Second extends First{
    int sub(int a,int b){
        return a+b;
    }
    
}
class Third extends Second{
    int mul(int p,int q){
        return p*q;
    }
    
}
public class Multilevel{
    public static void main(String[] args) {
        Third s=new Third();
        System.out.println(s.add(2,8));
        System.out.println(s.sub(4,9));
        System.out.println(s.mul(8,8));
    }    
}


