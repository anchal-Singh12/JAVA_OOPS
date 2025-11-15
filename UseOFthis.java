public class test1 {
    int x=10;
    void show(int x){
        System.out.println(x);
        System.out.println(this.x);
    }
    public static void main(String[] args) {
        test1 t= new test1();
        t.show(20); 
    }        
    
}
