package ua.training.view.menu;

import ua.training.view.util.GlobalConstants;

public class SortMenu extends Menu {
    public SortMenu() {
        super(GlobalConstants.MENU_SORT);
        initKeyItems(GlobalConstants.GENRE,GlobalConstants.DURATION,GlobalConstants.NAME);
    }
}
