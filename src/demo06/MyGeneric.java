package demo06;
/**
 * 泛型类
 * 语法：类名<T,T,T>
 * T是类型占位符，表示一种引用类型，如果写多个使用逗号隔开
 *
 */
public class MyGeneric<T> {
    // 使用泛型T
    // 1创建变量
    T t;
    // 2作为方法的参数
    public void show(T t) {
        System.out.println(t);
    }
    //3使用泛型作为返回值
    public T getT() {
        return t;
    }
}
