package demo06;

/**
 * 泛型接口
 * 语法:结构名<T>
 */
public interface MyInterface<T> {
    String name = "张三";

    T server(T t);
}
