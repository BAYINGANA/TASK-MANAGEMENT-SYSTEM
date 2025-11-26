package models;

import java.util.Scanner;
import java.util.ArrayList;

public abstract class UserCatalog {
    public static Scanner scanner = new Scanner(System.in);
    public int choice ;
    public static ArrayList<UserCatalog> users = new ArrayList<>();

    public int id;
    public String name;
    public String email;
    public String status;

    public UserCatalog(int id, String name, String status, String email) {
        this.id = id;
        this.name = name;
        this.status = status;
        this.email = email;
    }

    public abstract void createUser();

    public void displayAllUsers(){
        System.out.println("LIST OF ALL SYSTEM USERS");
        for(UserCatalog user : users){
            System.out.println(user);
        }
    }

    public void displayUser(){
        System.out.println("Enter user ID to display: ");
        int userID = scanner.nextInt();
        scanner.nextLine();

        for(UserCatalog user : users){
            if (user.id == userID){
                System.out.println(user);
                return;
            } else {
                System.out.println("User not found");
            }
        }
    }

    public void userActivation(){
        System.out.println("Enter user ID to update status:");
        int userId = scanner.nextInt();
        scanner.nextLine();
        for(UserCatalog user : users){
            if (user.id == userId) {
                user.status = user.status.equalsIgnoreCase("active")? "inactive" : "active";
                System.out.println("User status is now " + user.status);
                return;
            }
        }
        System.out.println("USer not found");
    }

    public void updateUser(){
        System.out.println("Enter user ID to update:");
        int userId = scanner.nextInt();
        scanner.nextLine();
        for(UserCatalog user : users){
            if (user.id == userId){
                System.out.println("Enter new user name:");
                user.name = scanner.nextLine();
                System.out.println("Enter new user email:");
                user.email = scanner.nextLine();
                System.out.println("User updated!!");
                return;
            }
        }
        System.out.println("User not found");
    }

    public void deleteUser(){
        System.out.println("Enter user ID to delete:");
        int userId = scanner.nextInt();
        scanner.nextLine();
        users.removeIf(u -> u.id ==userId);
        System.out.println("User deleted!!");
    }
    public abstract void searchUser();


    public void UserMenu(){
        System.out.println("*******************");
        System.out.println("* USER MANAGEMENT *");
        System.out.println("*******************");
        System.out.println("1. Create new user");
        System.out.println("2. View All Users");
        System.out.println("3. View User Details");
        System.out.println("4. Activate and Deactivate User");
        System.out.println("5. Update User Information");
        System.out.println("6. Delete User");
        System.out.println("7. Search User");
        System.out.println("8. Return to Main Menu");
        System.out.println("\n Enter choice: " );

        choice = scanner.nextInt();

        if(choice != 0 ){
            switch (choice){
                case 1:
                    System.out.println(" User creation ");
                    createUser();
                    break;
                case 2:
                    System.out.println("Users display");
                    displayAllUsers();
                    break;
                case 3:
                    System.out.println("User display");
                    displayUser();
                    break;
                case 4:
                    System.out.println("Status");
                    userActivation();
                case 5:
                    System.out.println("update");
                    updateUser();
                    break;
                case 6:
                    System.out.println("Delete");
                    deleteUser();
                    break;
                case 7:
                    System.out.println("Search");
                    searchUser();
                    break;
                case 8:
                    System.out.println("Return pending...");
                    break;
                default:
                    System.out.println("please enter a valid choice");
            }

        }
    }
    public String toString(){
        return String.format("User[ID=%d, Name=%s, Email=%s, Status=%s]",id, name, email, status);
    }
}
