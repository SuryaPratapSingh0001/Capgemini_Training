package Streams;

interface Additions{
    int add(int a, int b);
}
public class LambdaTest {
    public static void main() {
        Additions a1 = (a, b) ->{return a+b;};

        int a = a1.add(5,7);
        System.out.println(a);

    }
}
