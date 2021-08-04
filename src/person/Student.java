package person;

import java.util.Date;

public class Student extends Person {
    private String schoolName;

    public Student(String name, int age, Date birthday, String schoolName) {
        super(name, age, birthday);
        this.schoolName = schoolName;
    }

    @Override
    public String toString() {
        return "Student{" +"name='" + super.getName() + '\'' +
                ", age=" + super.getAge() +
                ", birthday=" + super.getBirthday()+
                "schoolName='" + schoolName + '\'' +
                '}';
    }

    @Override
    public void printInformation(){
        super.printInformation();
        System.out.println("姓名："+super.getName()+" "+"年龄："+super.getAge()
                +" "+"生日："+super.getBirthday()+" "+"学校："+schoolName);
    }

    public void printSchool(){
        System.out.println("学校："+schoolName);
    }


}
