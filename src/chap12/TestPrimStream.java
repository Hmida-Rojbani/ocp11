package chap12;

import java.util.List;
import java.util.stream.LongStream;

public class TestPrimStream {

    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5);
        var stream = list.stream().mapToInt(i->i);


        System.out.println(stream.summaryStatistics());

        var stream2 = LongStream.rangeClosed(1,10).parallel();
        stream2.forEachOrdered(System.out::println);
    }
}
