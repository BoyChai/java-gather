package demo08;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * TreeSet的使用
 * 存储机构:红黑树
 */
public class Main01 {
    public static void main(String[] args) {
        // 创建集合
        TreeSet<String> treeSet = new TreeSet<>();
        // 添加元素(会自动排序)
        treeSet.add("xyz");
        treeSet.add("abc");
        treeSet.add("hello");
        treeSet.add("xyz");  // 重复添加元素无效
        System.out.println("元素个数："+treeSet.size());
        System.out.println(treeSet);
        System.out.println("================================");
        // 删除
        treeSet.remove("xyz");
        System.out.println("删除之后:"+treeSet.size());
        System.out.println(treeSet);
        System.out.println("================================");
        // 遍历
        // 1 增强for
        for (String s : treeSet) {
            System.out.println(s);
        }
        System.out.println("================================");
        // 2 使用迭代器
        Iterator<String> iterator = treeSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("================================");
        // 判断
        System.out.println(treeSet.contains("abc"));
        System.out.println(treeSet.isEmpty());
    }
}
