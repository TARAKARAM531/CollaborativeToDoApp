package com.tarak;

public class Task {

    private static int counter = 1;

    private int id;
    private String title;
    private String category;
    private String assignedUser;
    private boolean completed;

    public Task(String title, String category, String assignedUser) {
        this.id = counter++;
        this.title = title;
        this.category = category;
        this.assignedUser = assignedUser;
        this.completed = false;
    }

    public int getId() { return id; }
    public String getTitle() { return title; }
    public String getCategory() { return category; }
    public String getAssignedUser() { return assignedUser; }
    public boolean isCompleted() { return completed; }

    public void markCompleted() {
        this.completed = true;
    }

    @Override
    public String toString() {
        return "Task ID: " + id +
                " | Title: " + title +
                " | Category: " + category +
                " | Assigned To: " + assignedUser +
                " | Status: " + (completed ? "Completed" : "Pending");
    }
}
