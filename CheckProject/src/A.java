
public class A {
    private static int a = 0;
    private int b = 0;

    public static int getA() {
        a++;
        return a;
    }

    private static class B {
        public int num = 0;
        public int plus(int num) {
            return num++;
        }
    }

    public int getB() {
        b++;
        return b;
    }
}
