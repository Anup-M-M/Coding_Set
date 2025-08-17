package test;

public class StaticContext {

    static int a = 10;

    static {
        a = 20;
        //System.out.println(a); // 20
    }

    public static void main(String[] args) {
        /*System.out.println(a); // 20
        a=30;
        System.out.println(a); // 30*/

        Test t1 = new Test();
        Test t2 = new Test();

        t1.x = 200;
        t1.y = 2000;

        System.out.println(t2.x);
        System.out.println(t2.y);
    }
}

class Test {
    static int x = 100;
    int y = 1000;
}
