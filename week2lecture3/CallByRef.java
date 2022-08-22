package week2lecture3;

public class CallByRef {
    public static void main(String[] args) {
        Test2 ob = new Test2(15,20);
        System.out.println("ob.a and ob.b before call: " +ob.a+ " " +ob.b);
        ob.change(ob);
        System.out.println("ob.a and ob.b after call: " +ob.a+ " " +ob.b);
    }
}
