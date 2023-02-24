package chap8;

import java.util.List;

public class TestAssert {
    public static long sum(List<Integer> list){
        assert list != null : "Be careful List passed to method sum is null";
        long sum = 0;
        for (var i  :list) {
            sum += i;
        }
        return sum;
    }
    public static List<Integer> getListFromDB(){
        //return List.of(1,2,3,4);
        return null;
    }
    public static void main(String[] args) {
        List<Integer> list = getListFromDB();
        long sum = sum(list);
        System.out.println("sum = "+sum);
    }
}
