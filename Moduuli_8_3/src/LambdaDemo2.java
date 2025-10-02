@FunctionalInterface  // optional, it allows the compiler to ensure that there is only one abstract function  
interface Drawable {
    void draw();
}

public class LambdaDemo2 {
    private static int width = 10;

    public static void main(String[] args) {
        Drawable d = () -> System.out.println("Drawing " + width);
        d.draw();
    }
}