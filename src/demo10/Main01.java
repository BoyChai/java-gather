package demo10;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Map接口的使用
 * 特点:(1)存储键值对(2)键不能重复,值可以重复(3)无序
 */
public class Main01 {
    public static void main(String[] args) {
        // 创建Map集合
        Map<String,String> map = new HashMap<>();
        // 添加元素
        map.put("cn","中国");
        map.put("uk","英国");
        map.put("usa","美国");
        map.put("cn","zhongguo"); // 键唯一 键如果一样则会覆盖之前的值
        System.out.println(map.size());
        System.out.println(map);
        System.out.println("===================================");

        // 删除
        map.remove("usa");
        System.out.println(map.size());
        System.out.println(map);
        System.out.println("===================================");

        // 遍历
        // 通过keySet拿到一个set集合对象 之后再通过迭代器进行遍历
        // 增强for这里不多解释了
        Set<String> set = map.keySet();
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            System.out.println(key+"----"+map.get(key));
        }
        System.out.println("===================================");
        // 通过entrySet获取一个set集合对象,之后通过增强for来遍历
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry.getKey()+"----"+entry.getValue());
        }
        System.out.println("===================================");
        // 判断
        System.out.println(map.containsKey("cn"));
        System.out.println(map.containsValue("英国"));
    }
}
