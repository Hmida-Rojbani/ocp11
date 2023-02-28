package chap11.old.way;

import java.util.Vector;

class Gen {
    private Object o;

    public Object getO() {
        return o;
    }

    public void setO(Object o) {
        this.o = o;
    }

    public Gen(Object o) {
        this.o = o;
    }
}

public class Test {

    public static void main(String[] args) {
        Vector v  =new Vector();
        v.add("hello");
        v.add(1);
        v.add(false);
        String o = null;
        if(v.get(0) instanceof String)
         o = (String) v.get(0);

    }
}
