package ua.training.view.menu;

import ua.training.view.util.GlobalConstants;

public class LocaleMenu extends Menu{
    public LocaleMenu() {
        super(GlobalConstants.MENU_LOCALE);
    }
    public void printMenu() {
        printMessages(GlobalConstants.UA,GlobalConstants.US);
    }
}
