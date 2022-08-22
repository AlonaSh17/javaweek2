package week2lecture1;
import java.io.IOException;
public class ReadSymbols {
    public static void main(String[] args)throws IOException {
        char ch;
        System.out.println("Press the button and Enter");
        ch=(char)System.in.read();
        System.out.println("You pressed the button "+ ch);

    }
}
