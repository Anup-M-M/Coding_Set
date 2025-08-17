package test;

//class as immuttable
final class Per {

    private final String name;
    private final int age;

    public Per(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class Person {
    public static void main(String[] args) {
        Per p = new Per("Anup", 25);

    }
}

