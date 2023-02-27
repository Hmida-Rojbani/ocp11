package chap10;

@OCP("val")
public class Test {
    @OCP("d")int df(){return 0;}
    public static void main(String[] args) {
        String s = (@OCP("d") String) new String("");
    }
}
