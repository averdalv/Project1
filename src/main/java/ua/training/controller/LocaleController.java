package ua.training.controller;

import ua.training.view.menu.LocaleMenu;

import java.util.Locale;
import java.util.Scanner;

public class LocaleController extends Controller {
    private final int ua = 1;
    private final int us = 2;
    public LocaleController(Scanner scanner) {
        super(scanner);
    }
    public Locale getLocaleFromUser() {
        Locale locale = null;
        int itemNumberFromUser = getItemNumberFromUser(new LocaleMenu());
        if(itemNumberFromUser == ua) {
            locale = new Locale("UA");
        }
        else if(itemNumberFromUser == us) {
            locale = new Locale("US");
        }
        return locale;
    }
}
