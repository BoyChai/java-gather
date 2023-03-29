package demo06;

public class Main02{
    public static void main(String[] args) {
        MyInterfaceImpl1 impl1 = new MyInterfaceImpl1();
        impl1.server("a");
        MyInterfaceImpl2<Integer> impl2 = new MyInterfaceImpl2<>();
        impl2.server(123);
    }

}
//指定类型实现
class MyInterfaceImpl1 implements MyInterface<String>{
    @Override
    public String server(String s) {
        System.out.println(s);
        return s;
    }
}
//未知类型实现
class MyInterfaceImpl2<T> implements MyInterface<T>{
    @Override
    public T server(T t) {
        System.out.println(t);
        return t;
    }
}




