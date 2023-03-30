package demo08;

import demo07.Person;

import java.util.TreeSet;

/**
 * 使用TreeSet保存数据
 * 数据结构:红黑树
 * 要求：元素都必须实现Comparable接口,compareTo()方法返回值为0,则认为重复元素
 */
public class Main02 {
    public static void main(String[] args) {
        // 创建集合
        TreeSet<Person> persons = new TreeSet<>();
        // 添加元素
        Person p1 = new Person("hello",20);
        Person p2 = new Person("xyz",21);
        Person p3 = new Person("zhangsan",22);
        Person p4 = new Person("zhangsan",20);
        persons.add(p1);
        persons.add(p2);
        persons.add(p3);
        persons.add(p4);
        System.out.println("元素个数:"+persons.size());
        System.out.println(persons);
        System.out.println("===================================");
        // 删除
        persons.remove(p1);
        System.out.println("元素个数:"+persons.size());
        System.out.println(persons);
        System.out.println("===================================");
        // 遍历
        // 判断
    }
}
