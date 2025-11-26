package models;

import java.util.Scanner;

public class TaskCatalog implements Completion {
    public Scanner scanner = new Scanner(System.in);
    public int choice ;

    public int taskId;
    public String taskName;
    public String taskDescription;
    public String taskStatus;
    public String taskPriority;
    public int assignedUserId;

    public void createTask(){
        System.out.println("Enter task ID: ");
        taskId = scanner.nextInt();
        System.out.println("Enter task name:");
        taskName = scanner.nextLine();
        System.out.println("Enter the task description:");
        taskDescription = scanner.nextLine();
        System.out.println("Enter the current task status:");
        taskStatus = scanner.nextLine();
        System.out.println("Enter the task priority:");
        taskPriority = scanner.nextLine();
        System.out.println("Eter assigned user ID:");
        assignedUserId = scanner.nextInt();
    }

    public void displayProjectTasks(){

    }

    public void updateTaskDetails(){
        int newID;
        String newTaskName;
        String newTaskDescription;
        String newTaskStatus;
        String newTaskPriority;
        int newAssignedUserId;

        System.out.println("Enter new task ID:");
        newID = scanner.nextInt();
        taskId = newID;

        System.out.println("Enter new task name:");
        newTaskName = scanner.nextLine();
        taskName = newTaskName;

        System.out.println("Enter the task description:");
        newTaskDescription = scanner.nextLine();
        taskDescription = newTaskDescription;

        System.out.println("Enter the current task status:");
        newTaskStatus = scanner.nextLine();
        taskStatus = newTaskStatus;

        System.out.println("Enter the task priority:");
        newTaskPriority = scanner.nextLine();
        taskPriority = newTaskPriority;

        System.out.println("Eter assigned user ID:");
        newAssignedUserId = scanner.nextInt();
        assignedUserId = newAssignedUserId;
    }

    public void updateTaskStatus(){

    }

    public void deleteTask(){

    }

    @Override
    public void markCompleted() {

    }

    @Override
    public boolean isCompleted() {
        return false;
    }

    @Override
    public void markInProgress() {

    }

    @Override
    public boolean isInProgress() {
        return false;
    }

    @Override
    public void markNotStarted() {

    }

    @Override
    public boolean isNotStarted() {
        return false;
    }

    @Override
    public void getCompletionStatus() {

    }

    @Override
    public void getTaskByStatus() {

    }

    public void TaskMenu(){
        System.out.println("*******************");
        System.out.println("* TASK MANAGEMENT *");
        System.out.println("*******************");
        System.out.println("1. Create new task");
        System.out.println("2. Display project tasks");
        System.out.println("3. Update task");
        System.out.println("4. Delete task");
        System.out.println("5. Return To Main Menu");
        System.out.println("\n Enter choice: " );

        choice = scanner.nextInt();

        if(choice != 0 ){
            switch (choice){
                case 1:
                    System.out.println(" Task creation pending...");
                    break;
                case 2:
                    System.out.println("Task list display pending...");
                    break;
                case 3:
                    System.out.println("Project tasks pending...");
                    break;
                case 4:
                    System.out.println("update pending...");
                    break;
                case 5:
                    System.out.println("Delete pending...");
                    break;
                case 6:
                    System.out.println("Return pending...");
                    break;
                default:
                    System.out.println("please enter a valid choice");
            }

        }
    }
}
