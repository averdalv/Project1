package ua.training.controller;

import ua.training.model.Composition;
import ua.training.model.Disk;
import ua.training.view.menu.*;
import ua.training.view.util.GlobalConstants;
import ua.training.view.util.LocalizationManager;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class MainController extends Controller {
    private static final int ADD_COMPOSITION_ITEM = 1;
    private static final int SHOW_COMPOSITIONS_ITEM = 2;
    private static final int SHOW_COMPOSITION_WITH_DURATION_ITEM = 3;
    private static final int SORT_COMPOSITIONS_ITEM = 4;
    private static final int SHOW_COOMON_DURATION = 5;
    private static final int CHANGE_LOCALE_ITEM = 6;
    private static final int EXIT_ITEM = 7;
    private Disk disk;
    public MainController(Scanner scanner) {
        super(scanner);
        disk = new Disk();
    }

    public List<Composition> getFilteredCompositions(Disk disk) {
        int minDuration = getDuration(GlobalConstants.DURATION_MIN);
        int maxDuration = getDuration(GlobalConstants.DURATION_MAX);
        List<Composition> filteredCompositions = new LinkedList<Composition>();
        try {

             filteredCompositions = disk.getCompositionsWithSuitableDuration(minDuration,maxDuration);
        }
        catch(IllegalArgumentException argExc) {
            printMenu(new ErrorMenu(GlobalConstants.EXCEPTION_ARGUMENTS));
        }
            return filteredCompositions;
    }
    public void processUser() {
        int numberFromUser = getItemNumberFromUser(new MainMenu());
        if(numberFromUser == ADD_COMPOSITION_ITEM) {
            CompositionController compositionController = new CompositionController(getScanner());
            disk.addComposition(compositionController.getCompositionFromUser());

        }
        else if(numberFromUser == SHOW_COMPOSITIONS_ITEM) {
            getMenu().printCompositions(disk.getCompositions());
        }
        else if(numberFromUser == SHOW_COMPOSITION_WITH_DURATION_ITEM) {
            getMenu().printCompositions(getFilteredCompositions(disk));
        }
        else if(numberFromUser == SORT_COMPOSITIONS_ITEM) {
            SortController sortController = new SortController(getScanner());
            sortController.sortCompositions(disk);
        }
        else if(numberFromUser == SHOW_COOMON_DURATION) {
            getMenu().printMessages(String.valueOf(disk.getCommonDuration()));
        }
        else if(numberFromUser == CHANGE_LOCALE_ITEM) {
            LocaleController localeController = new LocaleController(getScanner());
            LocalizationManager.getInstance().setLocale(localeController.getLocaleFromUser());
        }
        else if(numberFromUser == EXIT_ITEM) {
            return;
        }
        processUser();
    }
    private int getDuration(String typeDuration) {
        printMenu(new InputMenu(typeDuration));
        return getIntegerFromUser();
    }
}
