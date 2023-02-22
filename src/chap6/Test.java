package chap6;

import java.util.Arrays;

import static java.util.Arrays.*;

public class Test {

    public static void print(int... tab){
        System.out.println(asList(tab));
    }

    static final int i;
    static{
       i=10;
        System.out.println("SB");
    }
    {
        System.out.println("IB");
    }
    public static void main(String[] args) {
//        print(new int[5]);

//        Class<Math> clsMath = Math.class;
//        System.out.println(clsMath);
//        Integer i = 5;
//        i.parseInt("5");
//        System.out.println(i);
//        new Test();
//        new Test();
//        new Test();
//        new Test();
        int i = 5 ;
        String s = "5";
        StringBuilder sb =new StringBuilder("5");
        Imm imm = new Imm(i,s,sb);
        System.out.println(imm);
        sb.append("10");
        System.out.println(imm);
        StringBuilder sb2 = imm.getC();
        sb2.append("20");
        System.out.println(imm);
    }
}
