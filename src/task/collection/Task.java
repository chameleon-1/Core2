package task.collection;

import java.util.List;

public class Task {
    private int id;
    private String title;
    private boolean isComplete;

    public Task(int id, String title, boolean isComplete) {
        this.id = id;
        this.title = title;
        this.isComplete = isComplete;
    }

    public static void notComplete(List<Task> tasks) {
        for (Task t : tasks) {
            boolean test = true;
            if (t.isComplete != test) {
                System.out.println("todo15: не выполнены задания под номером " + t.id + " - " + t.title);
            }
        }
    }

    public static void status(List<Task> tasks, String title1) {
        for (Task t : tasks) {
            if (t.title == title1) {
                System.out.println("todo15: статус " + t.title + " - " + t.isComplete);
            }
        }
        System.out.println("todo15: проверь написание");
    }
}

