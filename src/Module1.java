import java.util.stream.IntStream;

public class Module1 {
    public static void main(String args[])
    {
        int x;
        for(x = 0; x<10; x++)
            System.out.println("This is x: " + x);

        System.out.println("This is x: " + ++x);
        IntStream alternati = IntStream.iterate(1, i -> -i);
        System.out.println("This is x: " + alternati.distinct());

    }


}
