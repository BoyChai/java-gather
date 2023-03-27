package demo01;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Main02 {
    public static void main(String[] args) {
        // 新建Collection对象
        Collection collection = new ArrayList();
        Student s1 = new Student("张三",20);
        Student s2 = new Student("张无忌",18);
        Student s3 = new Student("王二",22);
        //1 添加数据
        collection.add(s1);
        collection.add(s2);
        collection.add(s3);
        System.out.println(collection.size());
        System.out.println(collection);
        System.out.println("======================================");

        //2 删除数据
        collection.remove(s1);
        // 这样是不支持的
//        collection.remove(new Student("王二",22));
        System.out.println(collection.size());
        System.out.println(collection);
        System.out.println("======================================");
        //3.1 遍历
        for (Object o :
                collection) {
            System.out.println(o);
        }
        System.out.println("======================================");

        // 3.2 迭代器(迭代过程中是不允许拿到collection进行操作)
        Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("======================================");


        // 4判断
        System.out.println(collection.contains(new Student("王二",22))); //这个是不行的
        System.out.println(collection.contains(s3));
        System.out.println(collection.isEmpty());

    }
}
