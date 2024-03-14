public class TestClass {
  

    void whatsUp(){
        System.out.println("Whats up?");
    
    }
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        TestClass t1 = new TestClass();
        t1.whatsUp();
        staticMethod();
        t1.nonStaticMethod();
    }

    void nonStaticMethod(){
        System.out.println("Non-static method");

    }
    TestClass t1 = new TestClass();

    
    static void staticMethod(){
        System.out.println("Static method");
        TestClass t1 = new TestClass();
        t1.whatsUp();


    }
}