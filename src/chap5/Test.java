package chap5;

import java.util.List;
import java.util.function.Predicate;

public class Test {
//    public static void printEven(List<Integer> list){
//        for (var i:list)
//            if(i % 2 == 0)
//                System.out.print(i + " | ");
//        System.out.println();
//    }
//
//    public static void printOdd(List<Integer> list){
//        for (var i:list)
//            if(i % 2 != 0)
//                System.out.print(i + " | ");
//        System.out.println();
//    }
//
//    public static void printBy4(List<Integer> list){
//        for (var i:list)
//            if(i % 4 == 0)
//                System.out.print(i + " | ");
//        System.out.println();
//    }

    public static void print(List<Integer> list,Cond condition){
        for (var i:list)
            if(condition.test(i))
                System.out.print(i + " | ");
        System.out.println();
    }

    public static void printWithJavaFuncInt(List<Integer> list, Predicate<Integer> condition){
        for (var i:list)
            if(condition.test(i))
                System.out.print(i + " | ");
        System.out.println();
    }

    public static void main(String[] args) {
        List<Integer> list = List.of(8,1,5,6,7,2,3,4,8,9,5,2);
        print(list, new EvenCond());

        print(list, new Cond(){
            @Override
            public boolean test(Integer i) {
                return i % 2 != 0;
            }
        });

        print(list, (Integer i) -> {
                int j =10;
//                if(i == 5)
//                    throw new NullPointerException();
                return i % 2 != 0;
            }
        );
        print(list, i -> i % 2 != 0);

        Cond c = el -> el % 2 == 0;
        System.out.println(c.test(5));
        printWithJavaFuncInt(list, k -> k % 4==0);
    }
}
@FunctionalInterface
interface Cond {
    boolean test(Integer i);
}

class EvenCond implements Cond{

    @Override
    public boolean test(Integer i) {
        return i % 2 == 0;
    }
}