package task.collection;

import java.util.List;

public class Student18 {
    private String name;
    private String attendance;

    public Student18(String name, String attendance) {
        this.name = name;
        this.attendance = attendance;
    }

    public static void badAttendance(List<Student18> students18) {
        String s = "был";
        for (Student18 s18 : students18) {
            if (s != s18.attendance) {
                System.out.println("todo18: прогульщик - " + s18.name);
            }
        }
    }

    public static void averageAttendance(List<Student18> students18) {
        String s = "был";
        int i = 0;
        int j = students18.size();              //размер листа
        double d = j;                           //перевод в дабл для корректнго подсчета
        for (Student18 s18 : students18) {
            if (s == s18.attendance) {
                i++;
            }
        }
        double attendance1 = (i / d) * 100;
        System.out.println("todo18: посещаемость " + attendance1 + " процентов");
    }
}
