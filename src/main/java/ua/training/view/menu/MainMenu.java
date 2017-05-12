package ua.training.view.menu;

import ua.training.view.util.GlobalConstants;

public class MainMenu extends Menu {
    public MainMenu() {
        super(GlobalConstants.MENU_MAIN);
        initKeyItems(GlobalConstants.ADD_COMPOSITION,GlobalConstants.SHOW_COMPOSITIONS,GlobalConstants.FIND,GlobalConstants.SORT
                ,GlobalConstants.COMMON_DURATION,GlobalConstants.CHANGE_LOCALE,GlobalConstants.EXIT);
    }

}
