class OuterClass {
    static int y = 20;

    static class StaticNestedClass {
        static void accessStaticOuterMember() {
            System.out.println("y from OuterClass: " + y);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        OuterClass.StaticNestedClass inner = new OuterClass.StaticNestedClass();

        OuterClass.StaticNestedClass.accessStaticOuterMember();     

    }
}