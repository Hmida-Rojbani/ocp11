package chap7;

import java.io.Serializable;
import java.util.Comparator;

class Outer{
    private String name="Outer";
    //cannot have static inside it
    protected class Inner extends Outer implements Serializable {
       String name = "Inner";
        public void print(){
            System.out.println(Outer.this.name);
        }
    }
    static class StaticInner {
        public static void print(){
            System.out.println("static inner");
        }
        class DeeperInner {

        }
    }
}

public class TestInner {
    public static void main(String[] args) {
        Outer outer = new Outer();
        //Outer.Inner inner = outer.new Inner();
        Outer.Inner inner = new Outer().new Inner();
        inner.print();

        Outer.StaticInner staticInner = new Outer.StaticInner();
        Outer.StaticInner.print();
        staticInner.print();

        class InsideMain extends Outer implements I{
            public void print(){
                System.out.println("Inside Main" + outer);
            }
        }
        new InsideMain().print();
        //outer=null;
        Comparator comparator = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return 0;
            }
        };
        comparator = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return 0;
            }
        };
    }
}
