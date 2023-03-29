package demo06;

/**
 * 泛型方法
 * 语法:<T>返回值类型
 */
public class MyGenericMethod {
    // 泛型方法
    public <T> T show(T t) {
        System.out.println(t);
        return t;
    }

}
