package demo01;

public class Student {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    // 重写equals
    @Override
    public boolean equals(Object obj) {
        // 1 判断是否同一个对象
        if (this==obj) {
            return true;
        }
        // 2 判断是否为空
        if (obj==null) {
            return false;
        }
        // 3 判断是否是Student类型
        if (obj instanceof Student) {
            Student s = (Student) obj;
            // 4 比较属性
            if (this.name.equals(s.name)&&this.age == s.age){
                return true;
            }
        }
        // 5 都不满足
        return false;
    }
}
