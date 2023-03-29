package demo06;

/**
 * 使用泛型类
 */
public class Main01 {
    public static void main(String[] args) {
        MyGeneric<String> myGeneric1 = new MyGeneric<>();
        myGeneric1.t="hello";
        myGeneric1.show("大家好,加油!");
        System.out.println(myGeneric1.getT());

        MyGeneric<Integer> myGeneric2 = new MyGeneric<>();
        myGeneric2.t=100;
        myGeneric2.show(200);
        Integer t = myGeneric2.getT();
        System.out.println(t);

    }
}
