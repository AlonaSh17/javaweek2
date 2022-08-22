package week2lecture3;

import week2lecture3.ChkNum;

public class ParamDemo {
    public static void main(String[] args) {
        ChkNum chkNum = new ChkNum();
        if (chkNum.isEven(10)) System.out.println("Even number");
        if (chkNum.isEven(9)) System.out.println("Even number");
        if (chkNum.isEven(8)) System.out.println("Even number");

    }
}
