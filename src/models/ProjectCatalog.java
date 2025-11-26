package models;

import java.util.Scanner;


public abstract class ProjectCatalog {
    public Scanner scanner = new Scanner(System.in);
    public int choice;

    public int projectID;
    public String projectName;
    public String projectDescription;
    public String projectCategory;
    public String projectStatus;
    public String projectDeadline;

    public abstract void createProject();
    public abstract void displayAllProjects();
    public abstract void displayProject();
    public abstract void updateProject();
    public abstract void filterProject();
    public abstract void deleteProject();

    public abstract double getCompletionPercentage();

    public ProjectCatalog(int projectID, String projectName, String projectDescription, String projectCategory,String projectStatus, String projectDeadline){
        this.projectID = projectID;
        this.projectName = projectName;
        this.projectDescription = projectDescription;
        this.projectCategory = projectCategory;
        this.projectStatus = projectStatus;
        this.projectDeadline = projectDeadline;
    }

    public void ProjectMenu(){
        System.out.println("**********************");
        System.out.println("* PROJECT MANAGEMENT *");
        System.out.println("**********************");
        System.out.println("1. Create new project");
        System.out.println("2. Display projects");
        System.out.println("3. Display project Details");
        System.out.println("4. Update project Details");
        System.out.println("5. Filter Projects");
        System.out.println("6. Delete Project");
        System.out.println("7. Return To Main Menu");
        System.out.println("\n Enter choice: ");

        choice = scanner.nextInt();

        if(choice != 0 ){
            switch (choice){
                case 1:
                    System.out.println(" project creation pending...");
                    break;
                case 2:
                    System.out.println("project list display pending...");
                    break;
                case 3:
                    System.out.println("project details pending...");
                    break;
                case 4:
                    System.out.println("update pending...");
                    break;
                case 5:
                    System.out.println("Delete Project pending...");
                    break;
                case 6:
                    System.out.println("Filter pending...");
                    break;
                case 7:
                    System.out.println("Return pending...");
                    break;
                default:
                    System.out.println("please enter a valid choice");
            }

        }
    }


}
