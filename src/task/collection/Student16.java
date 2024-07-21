package task.collection;

import java.util.List;

public class Student16 {
    private String name;
    private int age;

    public Student16(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void show(List<Student16> students16) {
        for (Student16 s : students16) {
            System.out.println(s.name + ", " + s.age + " лет");
        }
    }
    public static void howAge (List <Student16> students16){
        for (Student16 s : students16){
            if(s.age>=20){
                System.out.println(s.name);
            }
        }
    }
}
