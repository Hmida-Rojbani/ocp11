package chap4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        String s1 = "hi";
        String s2 = "hi";
        String s3 = new String("hi");
        String s4 = "HI".toLowerCase().intern();
        System.out.println(s1.equals(s2) + " " +s1.equals(s3));

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);

        System.out.println(s1.equals(s4));
        System.out.println(s1 == s4);

        String s5 = "\t    df  df \n";
        System.out.println("|"+s5.stripLeading()+"|");
        StringBuilder sb = new StringBuilder();

        StringBuilder sb2 = sb.append("test").append(2);
        System.out.println(sb );
        List<StringBuilder> list = new ArrayList<>();
        list.add(sb);

        StringBuilder sb3 = new StringBuilder("test2");
        System.out.println("List contains "+list.contains(sb2));
        System.out.println(sb.toString().equals(sb3.toString()));
        List<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(2);
        System.out.println(l);
        l.remove(Integer.valueOf(1));
        System.out.println(l);
        Integer[] t = l.toArray(new Integer[0]);
        l.add(5);
        System.out.println(Arrays.toString(t));
        Integer[] tab = {5,2,7};
        System.out.println(Arrays.toString(tab));
        Arrays.sort(tab);
        System.out.println(Arrays.toString(tab));
        List<Integer> l2 = Arrays.asList(tab);
        System.out.println(l2);
        l2.set(1,18);
        System.out.println(l2);
        System.out.println(Arrays.toString(tab));
        l2.add(5);


    }
}
