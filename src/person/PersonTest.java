package person;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PersonTest {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date d = sdf.parse("2008-03-02");
        /*Person p1=new Person("小明",13,d);
        System.out.println(p1.getName()+" "+p1.getAge()+" "+p1.getBirthday());
        Date d1=p1.getBirthday();
        d1.setTime(12345L);
        System.out.println(p1.getName()+" "+p1.getAge()+" "+p1.getBirthday());*/
        Person person=new Student("小明",13,d,"第一初中");
        person.printInformation();
    }
}
