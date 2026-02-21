package com.tarak;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        TaskManager manager = new TaskManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add Task");
            System.out.println("2. Remove Task");
            System.out.println("3. Mark Task Completed");
            System.out.println("4. View Tasks");
            System.out.println("5. Simulate Concurrent Users");
            System.out.println("6. Exit");

            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter task: ");
                    String title = scanner.nextLine();

                    System.out.print("Enter category: ");
                    String category = scanner.nextLine();

                    System.out.print("Assign to user: ");
                    String user = scanner.nextLine();

                    manager.addTask(new Task(title, category, user));
                    break;

                case 2:
                    System.out.print("Enter task ID: ");
                    int removeId = scanner.nextInt();
                    manager.removeTask(removeId);
                    break;

                case 3:
                    System.out.print("Enter task ID: ");
                    int completeId = scanner.nextInt();
                    manager.markTaskCompleted(completeId);
                    break;

                case 4:
                    manager.displayTasks();
                    break;

                case 5:
                    UserThread t1 = new UserThread(manager, new User("Tarak"));
                    UserThread t2 = new UserThread(manager, new User("Arun"));

                    t1.start();
                    t2.start();
                    break;

                case 6:
                    System.exit(0);
            }
        }
    }
}
