package demo11;

import demo10.Student;

import java.util.TreeMap;

/**
 * TreeMap的使用
 * 存储结构: 红黑树
 */
public class Main01 {
    public static void main(String[] args) {
        // 新建集合
        TreeMap<Student,String> treeMap = new TreeMap<>();
        // 添加元素
        // PS: 这里treemap需要添加一个排序规则，需要在Student类里面实现Comparable接口，重写compareTo方法。不然会报类型转换错误。
        Student s1 =new Student("孙悟空", 100);
        Student s2 =new Student("猪八戒", 101);
        Student s3 =new Student("沙和尚", 102);
        treeMap.put(s1,"北京");
        treeMap.put(s2,"上海");
        treeMap.put(s3,"深圳");
        System.out.println("元素个数:"+treeMap.size());
        System.out.println(treeMap);
    }
}
