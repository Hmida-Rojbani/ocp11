package chap14;

public class TestBasicThread {
    static int count = 0;

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            count++;
            System.out.println(count);
            count++;
            System.out.println(count);
            count++;
            System.out.println(count);
        });
        Thread t2 = new Thread(() -> {
            count++;
            System.out.println(count);
            count++;
            System.out.println(count);
            count++;
            System.out.println(count);
        });
        Thread t3 = new Thread(() -> {
            count++;
            System.out.println(count);
            count++;
            System.out.println(count);
            count++;
            System.out.println(count);
        });
        System.out.println(count);
        t1.start();
        t2.start();
        t3.start();
        System.out.println(count);
    }
}
