package demo07;

import java.util.HashSet;
import java.util.Iterator;

/**
 * HashSet的使用
 * 存储结构: 哈希表(数组+链表+红黑树)
 */
public class Main03 {
    public static void main(String[] args) {
        // 创建集合
        HashSet<Person> persons = new HashSet<>();
        // 1 添加数据
        Person p1 = new Person("刘德华",20);
        Person p2 = new Person("林志玲",21);
        Person p3 = new Person("郭富城",22);
        Person p4 = new Person("梁朝伟",25);
        persons.add(p1);
        persons.add(p2);
        persons.add(p3);
        persons.add(p4);
        persons.add(p4); // 重复添加没有意义
        persons.add(new Person("梁朝伟",25)); // 这样添加可以，但是不建议这样干，建议重写person对象的hashcode方法和equals方法
        System.out.println("元素个数:" + persons.size());
        System.out.println(persons);
        System.out.println("=======================================");
        // 2 删除
        persons.remove(new Person("梁朝伟",25));
        System.out.println("元素个数:" + persons.size());
        System.out.println(persons);
        System.out.println("=======================================");
        // 3 遍历
        // 3.1增强for
        for (Person person : persons) {
            System.out.println(person);
        }
        System.out.println("=======================================");
        // 3.2迭代器
        Iterator<Person> iterator = persons.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("=======================================");
        // 4判断
        System.out.println(persons.contains(new Person("刘德华",20)));
        System.out.println(persons.isEmpty());
    }
}
