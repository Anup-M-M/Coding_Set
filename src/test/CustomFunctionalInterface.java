package test;

@FunctionalInterface
interface MyFunction{
    int operation(int a, int b);
}

public class CustomFunctionalInterface {
    public static void main(String[] args) {
        MyFunction addOperation = (x, y) -> x + y;

        System.out.println("addOperation : "+ addOperation.operation(5, 10));
    }
}
