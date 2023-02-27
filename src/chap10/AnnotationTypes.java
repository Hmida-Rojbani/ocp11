package chap10;

public @interface AnnotationTypes {
    int i();
    byte b();
    short sh();
    long l();
    float f();
    double d();
//    Double dd();
    boolean bl();
    char c();
    String str();
    Class<Test> cls();
    Flavors flavor();
    Override over();
    int[] arr() default {4,5,6};
}
