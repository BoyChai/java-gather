package demo02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 *  List子接口的使用
 *  特点:
 *  1 有序 有下标
 *  2 可以重复
 */
public class Main2 {
    public static void main(String[] args) {
        // 创建一个集合对象
        List list = new ArrayList();
        // 添加元素
        list.add("苹果");
        list.add("小米");
        list.add(0,"华为");
        System.out.println("元素个数:"+list.size());
        System.out.println(list);
        System.out.println("=============================");
        // 删除元素
//        list.remove("苹果");
//        list.remove(0);
//        System.out.println("元素个数:"+list.size());
//        System.out.println(list);
//        System.out.println("=============================");
        // 遍历
        // 使用for
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("=============================");
        // 增强for
        for (Object o : list) {
            System.out.println(o);
        }
        System.out.println("=============================");
        // 迭代器
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("=============================");
        // 列表迭代器
        // 系列表迭代器，允许程序员按任一方向遍历列表、迭代期间修改列表，并获得迭代器在列表中的当前位置。
        ListIterator listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            System.out.println(listIterator.nextIndex()+" "+listIterator.next());
        }
        System.out.println("=============================");
        // 倒叙
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previousIndex()+" "+listIterator.previous());
        }
        System.out.println("=============================");
        // 判断
        System.out.println(list.contains("苹果"));
        System.out.println(list.isEmpty());
        // 判断某个下标
        System.out.println(list.indexOf("华为"));
        System.out.println(list.indexOf("asd"));
    }
}
