//USE OF STATIC METHOD...
class Methstatic {
    static int square(int x){
        return x*x;
    }
}
public class Square{
    public static void main(String[] args) {
        System.out.println("square is: "+Methstatic.square(3));
    }
}
