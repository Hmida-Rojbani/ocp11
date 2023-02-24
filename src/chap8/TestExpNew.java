package chap8;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class TestExpNew {

    public static void checkedException() throws PersonalizedException, IOException {
        throw new RuntimeException("Our Exception");
    }
    public static void uncheckedException() {
        //throw new RuntimeException();
    }

    public static void main(String[] args) {
        //haveError();

        // System.out.println(scanner.next());
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("before try  read something");
            checkedException();
        } catch (PersonalizedException | IOException e) {
            //e = null; e is final
            System.out.println(e.getMessage());
        } catch (Exception e) {
            e = new Exception();
            System.out.println(e.getMessage());
            //System.exit(0);
            //return;
        } finally {
            System.out.println("Finally");
        }
        System.out.println("after try list size");

    }//282722
       // uncheckedException();

}
