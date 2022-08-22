package week2lecture1;

public class Example {
    public static void main(String[] args) {
        int n,d;
        n=10;
        d=2;
         if (d!=0 && (n%d)==0)
             System.out.println(d + " is divider to " +n);
         d=0;
         //укороченная операция предотвращает деление на 0
        if (d!=0 && (n%d)==0)
            System.out.println(d + " is divider to " +n);
        //не укороченная операция, ошибка деления на 0
        if (d!=0 & (n%d)==0)
            System.out.println(d + " is divider to " +n);

    }
}
