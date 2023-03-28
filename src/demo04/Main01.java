package demo04;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Main01 {
    public static void main(String[] args) {
        /**
         * 数组结构实现，查询快、增删慢;
         * JDK1.0版本添加,运行效率慢、线程安全。
         * 这个类用的比较少，但是面试的时候可能会问到。
         */
        Vector vector = new Vector();
        // 构造的时候如果不传值则默认传入10;
        // 增加
        vector.add(10);
        vector.add(20);
        vector.add(30);
        vector.add(40);
        vector.add(50);
        vector.add(60);
        System.out.println(vector.size());
        System.out.println(vector);
        System.out.println("===========================");
        // 删除
        vector.remove((Object) 10);
//        vector.clear();
        System.out.println(vector.size());
        System.out.println(vector);
        System.out.println("===========================");
        // 遍历
        Iterator iterator = vector.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("===========================");
        // 遍历 枚举器
        Enumeration elements = vector.elements();
        while (elements.hasMoreElements()) {
            System.out.println(elements.nextElement());
        }
        System.out.println("===========================");
        // 判断
        System.out.println(vector.contains(20));
        System.out.println(vector.indexOf(40));
        System.out.println(vector.isEmpty());
        System.out.println("===========================");
        // Vector其他方法
        // 获取对应索引的数值
        System.out.println(vector.get(1));
        System.out.println(vector.elementAt(2));
        // 获取最后面和最前面的值
        System.out.println(vector.lastElement());
        System.out.println(vector.firstElement());
    }
}
