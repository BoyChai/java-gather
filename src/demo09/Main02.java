package demo09;

import java.util.Comparator;
import java.util.TreeSet;

public class Main02 {
    public static void main(String[] args) {
        // 根据添加字符串的长度来排序
        TreeSet<String> treeSet = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int n1 = o1.length()-o2.length();
                int n2 = o1.compareTo(o2);
                return n1==0?n2:n1;
            }
        });
        treeSet.add("asd");
        treeSet.add("asdr");
        treeSet.add("asdr1");
        treeSet.add("asdr121");
        treeSet.add("a");
        treeSet.add("a2");
        System.out.println(treeSet);
    }
}
