package ua.training.view.menu;

import ua.training.view.util.GlobalConstants;

public class ErrorMenu extends Menu {
    public ErrorMenu(String key) {
        super(GlobalConstants.MENU_WRONG);
        initKeyItems(key);
    }
}
