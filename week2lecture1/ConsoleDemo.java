package week2lecture1;

public class ConsoleDemo {
    public static void main(String[] args) {
        System.out.println("Program was transfered " + args.length + " command line argument");
                System.out.println("arguments list: ");
        for (int i = 0; i < args.length; i++){
            System.out.println("arg[" + i + "]: " + args[i]);
        }
    }
}
