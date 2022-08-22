package week2lecture3.interfaceDemo;

public class ByTwo implements Series {
    int start;
    int val;

    ByTwo() {
        start = 0;
        val = 0;
    }

    @Override
    public int getNext() {
        val +=2;
        return val;
    }
    @Override
    public void reset() {
        start=0;
        val=0;
    }

    @Override
    public void setStart(int x) {
        start=x;
        val=x;
    }
}
