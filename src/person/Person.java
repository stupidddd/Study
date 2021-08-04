package person;

import java.util.Date;

public class Person {
    private String name;
    private int age;
    private Date birthday;

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

    public Date getBirthday() {
        return (Date) birthday.clone();
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Person(String name, int age, Date birthday) {
        this.name = name;
        this.age = age;
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", birthday=" + birthday +
                '}';
    }

    public void printInformation(){
        System.out.println("姓名："+name+" "+"年龄："+age+" "
                +"生日："+birthday);
    }
}
