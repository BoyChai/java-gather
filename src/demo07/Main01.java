package demo07;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * 测试Set接口的使用
 * 特点: 无序、无下标、元素不可重复。
 *
 */
public class Main01 {
    public static void main(String[] args) {
        // 创建集合
        Set<String> set = new HashSet<>();
        // 添加数据
        set.add("小米");
        set.add("三星");
        set.add("苹果");
        set.add("华为");
        System.out.println("数据个数:" +set.size());
        System.out.println(set);
        System.out.println("================================");
        // 删除数据
        set.remove("小米");
        System.out.println(set.size());
        System.out.println(set);
        System.out.println("================================");
        // 遍历
        // [增强for]
        for (String s : set) {
            System.out.println(s);
        }
        System.out.println("================================");
        // [迭代器]
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("================================");
        // 判断
        System.out.println(set.isEmpty());
        System.out.println(set.contains("华为"));
    }
}
