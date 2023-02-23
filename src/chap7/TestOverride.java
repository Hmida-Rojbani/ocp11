package chap7;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

class Father {
    public int i = 5;

    public int getI() {
        return i;
    }

    protected Number testMeth() throws IOException {
        System.out.println("father");
        return 1;
    }
    public static void hi(){
        System.out.println("HI from Father");
    }
    public void print(){}
}

class Son extends Father{
    public int i = 10;

    public int getI() {
        return i;
    }

    public static void hi(){
        System.out.println("HI from Son");
    }

    @Override
    public Integer testMeth() {
        System.out.println("son");
        return 1;
    }

    public int testMeth(int i) {
        return i;
    }
}

public class TestOverride {

    public static void main(String[] args) throws IOException {
        Son s = new Son();
        Father f =  s;
        Son s2 = (Son) f;
        Integer i = s.testMeth();
        s.print();
        s.testMeth(4);
        Number n = f.testMeth();
        f.print();
        //f.testMeth(4); Does not compile

        System.out.println(s.i);
        System.out.println(f.i);
        System.out.println(s.getI());
        System.out.println(f.getI());
        f.hi();
        s.hi();

    }
}
