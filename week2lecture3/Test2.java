package week2lecture3;

public class Test2 {
    int a,b;
    Test2(int i, int j){
        a=i;
        b=j;
    }
    //Передача обьекта методу. Теперь переменные ob.a ob.b обьекта, используемого при вызове, тоже будут меняться
    void  change(Test2 ob){
        ob.a = ob.a +ob.b;
        ob.b=-ob.b;
    }
}
