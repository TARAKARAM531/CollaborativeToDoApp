package com.tarak;

public class UserThread extends Thread {

    private TaskManager taskManager;
    private User user;

    public UserThread(TaskManager taskManager, User user) {
        this.taskManager = taskManager;
        this.user = user;
    }

    @Override
    public void run() {
        Task task = new Task(
                "Task by " + user.getUsername(),
                "General",
                user.getUsername()
        );

        taskManager.addTask(task);
        taskManager.displayTasks();
    }
}
