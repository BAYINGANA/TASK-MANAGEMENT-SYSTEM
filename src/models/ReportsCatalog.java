package models;

import java.util.Scanner;

public class ReportsCatalog {
    public Scanner scanner = new Scanner(System.in);
    public int choice ;
    public void ReportsMenu(){
        System.out.println("**********************");
        System.out.println("* Reports MANAGEMENT *");
        System.out.println("**********************");
        System.out.println("1. Project Completion Summary");
        System.out.println("2. Task Completion Summary");
        System.out.println("3. User Workload Summary");
        System.out.println("4. project completion percentage");
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
                    System.out.println("Status pending...");
                    break;
                case 4:
                    System.out.println("update pending...");
                    break;
                case 5:
                    System.out.println("Delete pending...");
                    break;
                default:
                    System.out.println("please enter a valid choice");
            }

        }
    }
}
