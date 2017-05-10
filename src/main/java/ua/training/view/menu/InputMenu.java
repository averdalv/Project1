package ua.training.view.menu;

import ua.training.view.util.GlobalConstants;

public class InputMenu extends Menu {
    public InputMenu(String key) {
        super(GlobalConstants.MENU_INPUT+key);
    }
    public void printMenu() {
        printMessages(GlobalConstants.EMPTY);
    }
}
