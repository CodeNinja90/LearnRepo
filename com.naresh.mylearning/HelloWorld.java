public class HelloWorld {


    public static void main(String[] args) {

        System.out.println("Hello World");
        Testing t = new Testing();
        t.test();
        Testing2 t2 = new Testing2();
        t2.test();
    }
}   

class Testing{

    public void test(){
        System.out.println("Testing");
    }
}


class Testing2{

    public void test(){
        System.out.println("Testing2");
    }
}