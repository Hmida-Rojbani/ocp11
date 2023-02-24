package chap8;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class PersonalizedException extends Exception{
    public PersonalizedException(String message) {
        super(message);
    }

    public PersonalizedException() {
    }
}
public class TestExp {

    public static void haveError(){
        haveError();
    }

    public static void checkedException() throws PersonalizedException, IOException {
        throw new RuntimeException("Our Exception");
    }
    public static void uncheckedException() {
        //throw new RuntimeException();
    }

    public static void main(String[] args) {
        //haveError();
        List<Scanner> scanner =new ArrayList<>();
        while(true){
            Scanner sc =new Scanner(System.in);
         scanner.add(sc);
        System.out.println("before try  read something");
       // System.out.println(scanner.next());
        try {
            checkedException();
        }
        catch (PersonalizedException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }catch (Exception e) {
            System.out.println(e.getMessage());
            //System.exit(0);
            //return;
        } finally {
            System.out.println("Finally");
            sc.close();
        }
        System.out.println("after try list size"+scanner.size());

    }//282722
       // uncheckedException();
    }
}
