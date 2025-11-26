package models;

public class regularUser extends UserCatalog {

    public regularUser(int id, String name, String status, String email) {
        super(id, name, status, email);
    }

    @Override
    public void createUser() {
        System.out.println("Enter regular user ID:");
        this.id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter regular user name:");
        name = scanner.nextLine();
        System.out.println("Enter regular user status:");
        status = scanner.nextLine();
        System.out.println("Enter regular user email:");
        email = scanner.nextLine();
    }

    @Override
    public void displayAllUsers() {

    }

    @Override
    public void displayUser() {

    }

    @Override
    public void userActivation() {

    }

    @Override
    public void updateUser() {

    }

    @Override
    public void deleteUser() {

    }

    @Override
    public void searchUser() {

    }
}
