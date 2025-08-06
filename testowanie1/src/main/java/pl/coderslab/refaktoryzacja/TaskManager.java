package pl.coderslab.refaktoryzacja;

import java.util.ArrayList;

public class TaskManager {
    ArrayList<String> tasks = new ArrayList<>();

    public void addTask(String task) {

        if (ifContainsTask(task)) {
            tasks.add(task);
            System.out.println("Task added successfully.");
        } else {
            System.out.println("Task already exists.");
        }
    }

    public boolean ifContainsTask(String task) {
        return tasks.contains(task);
    }
}