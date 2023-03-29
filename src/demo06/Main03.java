package demo06;

public class Main03 {
    public static void main(String[] args) {
        // 调用泛型方法
        MyGenericMethod myGenericMethod = new MyGenericMethod();
        // 无需指定类型，传入什么就是什么
        myGenericMethod.show("你好");
        myGenericMethod.show(200);
        myGenericMethod.show(3.14);
    }
}
