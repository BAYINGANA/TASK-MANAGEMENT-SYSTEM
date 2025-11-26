import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public Scanner scanner = new Scanner(System.in);
    public int choice ;
    public void MainMenu(){
        System.out.println("******************");
        System.out.println("* DASHBOARD MENU *");
        System.out.println("******************");
        System.out.println("1. User Management");
        System.out.println("2. Project Management");
        System.out.println("3. Task Management");
        System.out.println("4. Assignment Management");
        System.out.println("5. Completion Status");
        System.out.println("6. Reports");
        System.out.println("7.Exit System");
        System.out.println("\n Enter choice: " );

        choice = scanner.nextInt();

        if(choice != 0 ){
            switch (choice){
                case 1:
                    System.out.println(" Project management pending...");
                    break;
                case 2:
                    System.out.println("Task management pending...");
                    break;
                case 3:
                    System.out.println("Assignment pending...");
                    break;
                case 4:
                    System.out.println("Status pending...");
                    break;
                case 5:
                    System.out.println("Reports pending...");
                    break;
                case 6:
                    System.out.println("Exist pending...");
                default:
                    System.out.println("please enter a valid choice");
            }

        }
    }

}