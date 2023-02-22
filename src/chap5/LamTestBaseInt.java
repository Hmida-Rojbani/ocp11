package chap5;

import java.util.*;
import java.util.function.*;

public class LamTestBaseInt {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(8,1,5,6,7,2,3,4,8,9,5,2));
        Predicate<Integer> pre = i -> i % 2 == 0;
//        list.removeIf(pre);
//        System.out.println(list);
        Function<Integer, String > fun = i -> i +"";
        List<String> strs = new ArrayList<>();
        for (Integer i:list) {
            strs.add(fun.apply(i));
        }
        //Consumer<Integer> cons = i-> System.out.println(i);
        Consumer<Integer> cons = System.out::println;
        //list.forEach(cons);
        Random random = new Random();
        //Supplier<Integer> supp = ()-> random.nextInt();
        Supplier<Integer> supp = random::nextInt;
        System.out.println(supp.get());
        //Function<Integer, Integer > fun2 = i -> i *10;
        UnaryOperator<Integer> fun2 = i -> i *10;
        System.out.println(fun2.apply(10));
        //random = null;

        //Collections.sort(list, (o1, o2) -> o2-o1);
        //list.sort(null); // order asc
        list.sort((o1, o2) -> o2-o1); // order desc
        System.out.println(list);
    }
}
