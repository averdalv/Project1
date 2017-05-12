package ua.training.view.menu;

import ua.training.model.Composition;
import ua.training.view.util.GlobalConstants;
import ua.training.view.util.LocalizationManager;

import java.util.List;

//state
public abstract class Menu {
    private String startString; //common start for all properties in particular menu
    private LocalizationManager localizationManager = LocalizationManager.getInstance();
    protected String[] keyItems; // array of keys in properties file
    public Menu(String startString) {
        this.startString = startString;
    }
    public void initKeyItems(String ...keys) {
        keyItems = new String[keys.length];
        for(int i=0;i< keys.length;i++) {
            keyItems[i] = startString+keys[i];
        }
    }
    public void printMessages() {
        System.out.println();
        for(String key : keyItems) {
            System.out.println(localizationManager.getStringValue(key));
        }

    }

    public void printMessages(String ...messages) {
        System.out.println();
        for(String message : messages) {
            System.out.println(message);
        }

    }
    // return number of items in particular menu
    public  int getItemsNumber() {
        return keyItems.length;
    }
    public  void printMenu() {
        printMessages();
    }
    public void printCompositions(List<Composition> compositions) {
        int startNumber = 1;
        for(Composition composition : compositions) {
            System.out.print(startNumber + GlobalConstants.BRACKET);
            System.out.println(composition);
            startNumber++;
        }
    }
}
