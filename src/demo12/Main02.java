package demo12;

import java.util.*;

/**
 * Collections工具类
 */
public class Main02 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(20);
        list.add(5);
        list.add(12);
        list.add(30);
        list.add(6);
        System.out.println("list排序前:"+list);
        // sort排序
        Collections.sort(list);
        System.out.println("list排序后:"+list);
        // binarySearch 二分查找
        int i = Collections.binarySearch(list, 13);
        System.out.println(i);
        i = Collections.binarySearch(list, 12);
        System.out.println(i);
        // copy复制
        List<Integer> dest = new ArrayList<>();
        for (int k = 0; k < list.size(); k++) {
            // 拓展dest的带线啊哦
            dest.add(0);
        }
        // 往里面丢值
        Collections.copy(dest,list);
        System.out.println(dest);

        // reverse反转
        Collections.reverse(list);
        System.out.println("list反转之后"+list);
        // shuffle打乱
        Collections.shuffle(list);
        System.out.println("list打乱之后"+list);

        // 补充: list转成数组
        Integer[] arr = list.toArray(new Integer[0]);
        System.out.println("缓缓从数组之后的大小为"+ arr.length);
        System.out.println("缓缓从数组之后"+ Arrays.toString(arr));
        // 数组转成集合
        String[] names = {"张三","李四","王五"};
        // 集合是一个受限集合，不能添加和删除。进行添加删除的时候会进行报错"java.lang.UnsupportedOperationException"
        List<String> list2 = Arrays.asList(names);
        System.out.println(list2);

        //基本类型转换成集合时，需要修改为包装类型，不然转换之后会有问题
        Integer[] nums = {100,200,300,400,500};
        List<Integer> list3 = Arrays.asList(nums);
        System.out.println(list3);



    }
}
