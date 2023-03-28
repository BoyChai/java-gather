package demo05;

import demo01.Student;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main01 {
    /**
     * LinkedList
     * 数据结构：双向链表
     * 链表数据结构，增删快，查询慢。
     */
    public static void main(String[] args) {
        // 创建集合
        LinkedList list = new LinkedList();
        // 1添加元素
        Student s1 = new Student("刘德华",20);
        Student s2 = new Student("郭富城",22);
        Student s3 = new Student("梁朝伟",18);
        Student s4 = new Student("张学友",21);
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        System.out.println("元素个数:" + list.size());
        System.out.println(list);
        System.out.println("============================================");
        // 2删除
        list.remove(s1);
        list.remove(new Student("张学友",21));
        System.out.println("删除之后"+list.size());
        System.out.println("删除之后"+list);
        System.out.println("============================================");
        // 遍历
        // 3.1
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("============================================");
        // 3.2增强for
        for (Object o : list) {
            Student s = (Student) o;
            System.out.println(s);
        }
        System.out.println("============================================");
        // 3.3使用迭代器
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("============================================");
        // 3.4使用listIterator
        ListIterator listIterator = list.listIterator();
        // 正序
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }
        System.out.println("============================================");
        // 倒叙
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }
        System.out.println("============================================");
        // 4判断
        System.out.println(list.contains(s3));
        System.out.println(list.isEmpty());
        System.out.println("============================================");
        // 5获取
        System.out.println(list.indexOf(s3));
    }
}
