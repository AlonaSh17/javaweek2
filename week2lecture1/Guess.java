package week2lecture1;

import java.io.IOException;

public class Guess {
    public static void main(String[] args)throws IOException {
        char ch, answer ='K';
        System.out.println("Guess the letter from a range A-Z");
        ch=(char)System.in.read();
        if (ch==answer) System.out.println("Right");

    }
}
