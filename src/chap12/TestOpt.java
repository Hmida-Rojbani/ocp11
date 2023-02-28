package chap12;

import java.util.Optional;
import java.util.OptionalDouble;

public class TestOpt {

    public static Optional<Double> average(int... arr){
        if(arr== null || arr.length==0)
            return Optional.empty();
        double sum =0;
        for (int i : arr) {
            sum+=i;
        }
        return Optional.of(sum/arr.length);
    }

    public static OptionalDouble averagePrimitive(int... arr){
        if(arr== null || arr.length==0)
            return OptionalDouble.empty();
        double sum =0;
        for (int i : arr) {
            sum+=i;
        }
        return OptionalDouble.of(sum/arr.length);
    }
    public static void main(String[] args) {
        System.out.println(average());
        System.out.println(average(1));
        System.out.println(average(1,2,3,4,5,6));
       // var opt = averagePrimitive();
        var opt = average();
        if(opt.isPresent())
      //      System.out.println(opt.getAsDouble());
           System.out.println(opt.get());
        System.out.println(opt.orElse(Double.NaN));
        System.out.println(opt.orElseGet(()->Double.NaN));
        //System.out.println(opt.orElseThrow(()-> new RuntimeException("No result")));
        //System.out.println(opt.orElseThrow());

        opt.ifPresent(System.out::println);
    }
}
