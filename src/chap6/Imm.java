package chap6;

public final class Imm {
    private final int a;
    private final String b;
    private final StringBuilder c;

    public Imm(int a, String b, StringBuilder c) {
        this.a = a;
        this.b = b;
        this.c = new StringBuilder(c);
    }

    public int getA() {
        return a;
    }

    public String getB() {
        return b;
    }

    public StringBuilder getC() {
        return new StringBuilder(c);
    }

    @Override
    public String toString() {
        return "Imm{" +
                "a=" + a +
                ", b='" + b + '\'' +
                ", c=" + c +
                '}';
    }
}
