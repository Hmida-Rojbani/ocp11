package chap12;

import java.util.function.DoubleFunction;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.ToIntFunction;

public class TestIntf {

    public static void main(String[] args) {
        Function<String,Integer> fun = s -> s.length();
        ToIntFunction<String> fun2 = s-> s.length();

        Function<Double,String> fun3 = d -> d+"";
        DoubleFunction<String> fun4 = d -> d+"";

        System.out.println(fun.apply("test"));
        System.out.println(fun2.applyAsInt("test"));

        System.out.println(fun3.apply(2.6));
        System.out.println(fun4.apply(2.6));
    }
}
