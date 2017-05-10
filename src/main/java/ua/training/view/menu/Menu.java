package ua.training.view.menu;

import ua.training.view.util.LocalizationManager;

//state
public abstract class Menu {
    private String startString; //common start for all properties in particular menu
    private LocalizationManager localizationManager = LocalizationManager.getInstance();
    public Menu(String startString) {
        this.startString = startString;
    }

    public void printMessages(String ...keys) {
        for(String key : keys) {
            System.out.println(localizationManager.getStringValue(startString+key));
        }
    }
    abstract void printMenu();
}
