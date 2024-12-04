package lang.reflect;

public class ClassCreateMain {
    public static void main(String[] args) throws Exception{
        Class helloClass = Class.forName("lang.reflect.Hello");
        Hello hello = (Hello) helloClass.getDeclaredConstructor().newInstance();
        String result = hello.hello();
        System.out.println("result = " + result);
    }
}
