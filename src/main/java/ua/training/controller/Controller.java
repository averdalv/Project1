package ua.training.controller;

import ua.training.model.Disk;
import ua.training.view.menu.*;
import ua.training.view.util.GlobalConstants;

import java.util.Scanner;

public class Controller {
    private final int firstItemNumber = 1; // number that is first in the menu
    private Menu menu;
    private Scanner scanner;
    public Controller(Scanner scanner) {
        this.scanner = scanner;
    }
    public int getIntegerFromUser() {
        while(!scanner.hasNextInt()) {
            printMenu(new ErrorMenu(GlobalConstants.INT));
            scanner.next();
        }
        return scanner.nextInt();
    }
    public String getStringFromUser() {
        scanner.nextLine();
        return scanner.nextLine();
    }

    public void printMenu(Menu menuToPrint) {
        this.menu = menuToPrint;
        menu.printMenu();
    }
    public Menu getMenu() {
        return menu;
    }
    //method that returns number of item that user want to see
    public int getItemNumberFromUser(Menu menuForShowing) {
        printMenu(menuForShowing);
        int numberFromUser = getIntegerFromUser();
        while(numberFromUser < firstItemNumber && numberFromUser > menu.getItemsNumber()) {
            printMenu(new ErrorMenu(GlobalConstants.NUMBER));
            numberFromUser = getIntegerFromUser();
        }
        return numberFromUser;
    }
    public Scanner getScanner() {
        return scanner;
    }

}
