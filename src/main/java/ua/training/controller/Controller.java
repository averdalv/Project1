package ua.training.controller;

import ua.training.model.Disk;
import ua.training.view.menu.*;
import ua.training.view.util.GlobalConstants;

import java.io.InputStream;
import java.util.Scanner;

public class Controller {

    private Menu menu;
    private Scanner scanner;
    private Disk disk;
    public Controller(InputStream inputStream) {
        scanner = new Scanner(inputStream);
        menu = new MainMenu();
        disk = new Disk();
    }

    public int getIntegerFromStream() {
        if(!scanner.hasNextInt()) {
            menu = new ErrorMenu(GlobalConstants.NUMBER);
        }
    }
    public String getStringFromStream() {

    }
}
