package ua.training.main;

import ua.training.controller.MainController;

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        MainController controller = new MainController(new Scanner(System.in));
        controller.processUser();
    }
}
