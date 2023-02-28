package chap11.neww.way;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Gen<T> {
    T obj;

    public T getObj() {
        return obj;
    }

    <T extends CharSequence> void print(T t) {

    }

    public void setObj(T obj) {
        this.obj = obj;
    }
}

public class TestNew {

    public static void print(List<? super String> list){
        System.out.println(list);
    }
    public static void main(String[] args) {
        List<?> list = new ArrayList<Integer>(Arrays.asList(1,2,3,4));
        List<? extends Integer> list2 = new ArrayList<Integer>(Arrays.asList(1,2,3,4));
        List<? super Integer> list3 = new ArrayList<Integer>(Arrays.asList(1,2,3,4));
        List<String> list4 = new ArrayList<>(Arrays.asList("1","2","3","4"));
       //list.add(1); does not compile
       //list2.add(1); does not compile

       list3.add(1);
        //print(list);
        //        Gen<Integer> g1 = new Gen<>();
//        g1.setObj(1);
//        Integer i = g1.getObj();
//        g1.print(5);
    }
}
