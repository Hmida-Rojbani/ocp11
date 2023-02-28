package method.ref;

import java.util.function.*;

public class Test {

    public static void main(String[] args) {
        //Supplier<StringBuilder> supSB = () -> new StringBuilder();
        Supplier<StringBuilder> supSB = StringBuilder::new;
        //StringBuilder sb = new StringBuilder("test");
        //Function<String,StringBuilder> f = (String str) -> new StringBuilder(str);
        Function<String,StringBuilder> f = StringBuilder::new;
        //StringBuilder sb2 = new StringBuilder(sb);
        //Function<StringBuilder,StringBuilder> f2 =(StringBuilder sb) -> new StringBuilder(sb);
        //UnaryOperator<StringBuilder> f2 =(StringBuilder sb) -> new StringBuilder(sb);
        UnaryOperator<StringBuilder> f2 = StringBuilder::new;
        String str = "abc";
       // Predicate<String> pre = s -> str.startsWith(s);
        Predicate<String> pre = str::startsWith;
        Predicate<String> pre11 = s -> s.startsWith(str);
        //BiPredicate<String,String> pre2 = (s,s1) -> s.startsWith(s1);
        BiPredicate<String,String> pre2 = String::startsWith;
    }

}
