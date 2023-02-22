package chap3;

import java.io.Serializable;

public class Test {

    public static void main(String[] args) {
        int i = 0;
        int j = i++;
        int k = 9+5+2*++i;
        System.out.println(i+"|"+j+"|"+k);
        byte u = 8;//00001000
        System.out.println(u << 2);//00100000
        System.out.println(u >> 1);//00000100

        String s = null;

        System.out.println(s != null && s.length()>0);

        int x;
        x = j !=0 ? k : i;

        long l = i;
        byte ss = 127; //byte 2^8  -> 256 -> -128 : 127
        System.out.println(ss);
        int aa = ss + ss+ '0';
        int c = 'a';
        System.out.println(c);
        Character ii = '5';
        Double d = 5.5;
        //System.out.println(ii instanceof Integer); // Compile Error
        //System.out.println(d instanceof I);// Compile Error
        C cc = new CC();
        System.out.println(cc instanceof I);

        if(i!=0) {
            for (int m = 0; m < 10; m++) {

            }
            i++;
        }

        int month = 0;
        switch (month){
            default: break;
            case 1 :
                System.out.println("first month of year");
            case 3 :
            case 5 :
                System.out.println("31 day");
                break;
            case 2 :
                System.out.println("28 day");
                break;

            case 4 :case 6 :
                System.out.println("30 day");
                break;
        }
    }
}
interface I {}
class C {}
class CC extends C implements I {}