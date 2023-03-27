package demo02;

import java.util.ArrayList;
import java.util.List;

public class Main01 {
    public static void main(String[] args) {
        List list = new ArrayList();
        // 添加数字类型(自动装填)
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);
        list.add(80);
        System.out.println(list.size());
        System.out.println(list.toString());
        System.out.println("=============================================");
        // 删除操作
//        list.remove(20); // 会报错，因为这个remove是根据下标来删除内容的
        list.remove((Object)20);
        list.remove(new Integer(30));
        System.out.println(list.size());
        System.out.println(list.toString());
        System.out.println("=============================================");

        // 补充方法subList: 返回子集合,含头不含尾
        List subList = list.subList(1, 3);
        System.out.println(subList.toString());
    }

}
