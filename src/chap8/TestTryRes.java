package chap8;

import java.io.Closeable;
import java.io.IOException;

public class TestTryRes {

    static class Res implements Closeable {

        public Res(){
            System.out.println("Open Res");
        }

        @Override
        public void close(){ // throws IOException
            System.out.println("Close Res");
            throw new RuntimeException("Res Exp");
        }
    }

    static class Res2 implements AutoCloseable {

        public Res2(){
            System.out.println("Open Res2");
        }


        @Override
        public void close()  {//throws Exception
            System.out.println("Close Res2");
            throw new RuntimeException("Res2 Exp");
        }
    }


    public static void lunchExp(){
        throw new RuntimeException("Meth");
    }
    public static void main(String[] args) {
        Res res =new Res();
        try(res;Res2 res2 =new Res2()){
            System.out.println("Inside try");
            lunchExp();
            throw new RuntimeException("Try");
        }finally {
            System.out.println("Inside finally");
        }
        //System.out.println("Outside try");
    }
}
