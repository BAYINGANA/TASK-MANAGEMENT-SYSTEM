package models;

import java.util.Scanner;

public class AssignmentCatalog {
    public Scanner scanner = new Scanner(System.in);
    public int choice ;
    public void AssignmentMenu(){
        System.out.println("*************************");
        System.out.println("* ASSIGNMENT MANAGEMENT *");
        System.out.println("*************************");
        System.out.println("1. Assign User to Task");
        System.out.println("2. Display All Assignments");
        System.out.println("3. Display Assignments By User");
        System.out.println("4. Change Assignment");
        System.out.println("5. Remove Assignment");
        System.out.println("6. Return To Main Menu");
        System.out.println("\n Enter choice: " );

        choice = scanner.nextInt();

        if(choice != 0 ){
            switch (choice){
                case 1:
                    System.out.println(" Task assignment pending...");
                    break;
                case 2:
                    System.out.println("assignments display pending...");
                    break;
                case 3:
                    System.out.println("user assignments pending...");
                    break;
                case 4:
                    System.out.println("update pending...");
                    break;
                case 5:
                    System.out.println("Delete pending...");
                    break;
                case 6:
                    System.out.println(" Return pending...");
                    break;
                default:
                    System.out.println("please enter a valid choice");
            }

        }
    }
}
