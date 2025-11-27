import java.util.Scanner;
import services.*;
import utils.ConsoleMenu;
import models.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ConsoleMenu menu = new ConsoleMenu();
        Scanner scanner = new Scanner(System.in);

        menu.MainMenu();
        int choice = scanner.nextInt();
        scanner.nextLine();
    }
}