package week2lecture3;

public class MyClass {
    private int alpha;
    public int beta;
    int gamma;

    //Методы доступа к переменной альфа. Члены класса могут обращаться к закрытыми членам того же класса
    void setAlpha(int a){
        alpha=a;
    }

    public int getGamma() {
        return gamma;
    }

    public void setGamma(int gamma) {
        this.gamma = gamma;
    }

    int getAlpha(){
        return alpha;
    }
        }
