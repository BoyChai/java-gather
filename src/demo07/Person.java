package demo07;

/**
 * 人类
 */

public class Person  implements Comparable<Person>{
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int hashCode() {
        return this.name.hashCode() + this.age;
    }

    @Override
    public boolean equals(Object obj) {
        if ( this == obj) {
            return true;
        }
        if (obj == null){
            return false;
        }
        if (obj instanceof Person) {
            Person p = (Person) obj;
            if (this.name==p.name&&this.age==p.age) {
                return true;
            }
        }
        return false;
    }

    // 先按姓名比，然后再按年龄比
    @Override
    public int compareTo(Person o) {
        int n1 = this.getName().compareTo(o.getName());
        int n2 = this.age - o.getAge();
        return n1==0?n2:n1;
    }
}
