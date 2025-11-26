package models;

import java.util.Scanner;

public class CompletionStatusCatalog {
    public Scanner scanner = new Scanner(System.in);
    public int choice ;
    public void CompletionStatusMenu(){
        System.out.println("********************************");
        System.out.println("* Completion Status MANAGEMENT *");
        System.out.println("********************************");
        System.out.println("1. Update Task Status");
        System.out.println("2. Display Project Completion Status ");
        System.out.println("3. Filter Tasks by Status");
        System.out.println("4. Return to Main Menu");
        System.out.println("\n Enter choice: " );

        choice = scanner.nextInt();

        if(choice != 0 ){
            switch (choice){
                case 1:
                    System.out.println(" Task completion pending...");
                    break;
                case 2:
                    System.out.println("Task progression pending...");
                    break;
                case 3:
                    System.out.println("Start task pending...");
                    break;
                case 4:
                    System.out.println("project Status display pending...");
                    break;
                case 5:
                    System.out.println("filter pending...");
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
