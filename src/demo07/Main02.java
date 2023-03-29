package demo07;

import java.util.HashSet;
import java.util.Iterator;

/**
 * HashSet
 * 存储结构:哈希表(数组+链表+红黑树)
 */

public class Main02 {
    public static void main(String[] args) {
        // 新建合集
        HashSet<String> hashSet = new HashSet();
        // 1 添加元素
        hashSet.add("刘德华");
        hashSet.add("梁朝伟");
        hashSet.add("林志玲");
        hashSet.add("周润发");
        System.out.println("元素个数:"+hashSet.size());
        System.out.println(hashSet.toString());
        System.out.println("==========================================");
        // 2 删除数据
        hashSet.remove("刘德华");
        System.out.println("删除之后:"+hashSet.size());
        System.out.println("==========================================");
        // 3 遍历操作
        // 3.1增强for
        for (String s : hashSet) {
            System.out.println(s);
        }
        System.out.println("==========================================");
        // 3.2迭代器
        Iterator<String> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("==========================================");
        // 4 判断
        System.out.println(hashSet.contains("郭富城"));
        System.out.println(hashSet.contains("林志玲"));
        System.out.println(hashSet.isEmpty());

    }
}
