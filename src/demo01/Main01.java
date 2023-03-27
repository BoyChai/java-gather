package demo01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Collection接口的使用
 * (1)添加元素
 * (2)删除元素
 * (3)遍历元素
 * (4)判断
 */
public class Main01 {
    public static void main(String[] args) {
        // 创建集合
        Collection collection=new ArrayList();
//         * (1)添加元素
        collection.add("苹果");
        collection.add("西瓜");
        collection.add("榴莲");
        System.out.println("元素个数"+collection.size());
        System.out.println(collection);
        System.out.println("=====================================================");
//         * (2)删除元素
        collection.remove("榴莲");
        System.out.println("删除个数"+collection.size());
        System.out.println(collection);
//        collection.clear(); 清除
        System.out.println("=====================================================");

//         * (3)遍历元素
        // 3.1使用增强for
        for (Object o :collection) {
            System.out.println(o);
        }
        System.out.println("=====================================================");
        // 3.2使用迭代器(迭代器专门用来遍历集合的一种方式)
        // hasNext();有没有下一个元素
        // next();获取下一个元素
        // remove();删除当前元素
        Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
//            collection.remove(iterator.next()); 不支持这样干，这样干会报错。
            iterator.remove();
        }
        System.out.println("元素个数:"+collection.size());
        System.out.println("=====================================================");

//         * (4)判断
        collection.add("西瓜");
        System.out.println(collection.contains("西瓜"));
        System.out.println(collection.contains("黄瓜"));
    }
}
