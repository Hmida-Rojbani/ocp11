package chap7;

interface I {
   default void print(){

    };
    default void hi(){
      hiImpl();
    }
    private void hiImpl() {
        System.out.println("HI");
    }
    static void hello(){
        helloImpl();
    }
    private static void helloImpl(){
        System.out.println("Hello");
    }
}
interface I2 {
    //void print();
    default void hi(){
        System.out.println("HI2");
    }
}

class Cls implements I,I2{

    @Override
    public void hi() {
        I.super.hi();
        print();
        I.hello();
    }
}

abstract class Cls2 {
    public abstract void hi();
}

class Cls3 extends Cls2 implements I{

    @Override
    public void hi() {

    }
}

class Cls4 {
    public  void hi() {
    I.hello();
    }
}
interface I3 extends I{
    void hi();
}

class Cls5 extends Cls4 implements I3 {

}
public class TestInt {
}
