package demo03;

import demo01.Student;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/**
 * ArrayList的使用
 * 数据结构：数组，查找遍历快，增删慢
 */
public class Main01 {
    public static void main(String[] args) {
        // 创建集合
        ArrayList arrayList = new ArrayList();
        // 1.添加元素
        Student s1 = new Student("刘德华",20);
        Student s2 = new Student("郭富城",22);
        Student s3 = new Student("梁朝伟",18);
        Student s4 = new Student("张学友",21);
        arrayList.add(s1);
        arrayList.add(s2);
        arrayList.add(s3);
        arrayList.add(s4);
        System.out.println("元素个数:"+arrayList.size());
        System.out.println(arrayList.toString());
        System.out.println("==============================================");
        // 2.删除元素
//        arrayList.remove(0); // 通过下标删除
//        arrayList.remove(s4); // 可以删除
//        arrayList.remove(new Student("张学友",21)); // 在重写类 equals 方法之后生效，否则没效果
        System.out.println("元素个数:"+arrayList.size());
        System.out.println(arrayList.toString());
        System.out.println("==============================================");

        // 3.遍历元素【重点】
        // 3.1 使用迭代器
        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("==============================================");
        // 3.2 列表迭代器
        ListIterator listIterator = arrayList.listIterator();
        // 3.2.1 从前往后遍历
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }
        System.out.println("==============================================");
        // 3.2.2 从后往前遍历
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previousIndex()+" "+listIterator.previous());
        }
        System.out.println("==============================================");

        // 4.判断
        System.out.println(arrayList.contains(s1));
        System.out.println(arrayList.contains(new Student("郭富城",22)));
        System.out.println(arrayList.isEmpty());
        System.out.println("==============================================");

        // 5.查找
        System.out.println(arrayList.indexOf(s1));
    }
}
