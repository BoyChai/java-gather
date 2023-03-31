package demo10;

import java.util.HashMap;
import java.util.Map;

/**
 * HashMap
 * 存储结构:哈希表(数组+链表+红黑树)
 */
public class Main02 {
    public static void main(String[] args) {
        // 创建集合
        HashMap<Student,String> students = new HashMap<>();
        // 添加元素
        Student s1 = new Student("孙悟空",100);
        Student s2 = new Student("猪八戒",101);
        Student s3 = new Student("沙和尚",102);
        students.put(s1,"北京");
        students.put(s2,"上海");
        students.put(s3,"杭州");
        // 在补充些eq和hashcode方法之前这样添加是有效的，因为他会去对比他们的内存地址而不是类里面具体的数值
        students.put(new Student("沙和尚",102),"杭州");
        System.out.println(students.size());
        System.out.println(students);
        System.out.println("=====================================");
        // 删除
        students.remove(s1);
        System.out.println(students.size());
        System.out.println(students);
        System.out.println("=====================================");
        // 遍历
        // keySet增强for
        for (Student student : students.keySet()) {
            System.out.println(student+"----"+students.get(student));
        }
        System.out.println("=====================================");
        // 使用entrySet();
        for (Map.Entry<Student, String> entry : students.entrySet()) {
            System.out.println(entry.getKey()+"----"+entry.getValue());
        }
        System.out.println("=====================================");
        // 判断
        // 第二个判断需要重写eq和hashcode方法
        System.out.println(students.containsKey(s2));
        System.out.println(students.containsKey(new Student("猪八戒",101)));
    }
}
