package com.tarak;

import java.util.ArrayList;
import java.util.List;

public class TaskManager {

    private List<Task> tasks = new ArrayList<>();

    public synchronized void addTask(Task task) {
        tasks.add(task);
        System.out.println("Task added successfully.");
    }

    public synchronized void removeTask(int taskId) {
        tasks.removeIf(task -> task.getId() == taskId);
        System.out.println("Task removed if existed.");
    }

    public synchronized void markTaskCompleted(int taskId) {
        for (Task task : tasks) {
            if (task.getId() == taskId) {
                task.markCompleted();
                System.out.println("Task marked as completed.");
                return;
            }
        }
    }

    public synchronized void displayTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks available.");
            return;
        }

        for (Task task : tasks) {
            System.out.println(task);
        }
    }
}
