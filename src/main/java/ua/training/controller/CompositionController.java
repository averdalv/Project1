package ua.training.controller;

import ua.training.model.Composition;
import ua.training.model.Genre;
import ua.training.view.util.GlobalConstants;
import java.util.Scanner;
import ua.training.view.menu.*;
public class CompositionController extends Controller{
    private final String GENRE_REG_EXP = "ROCK|JAZZ|CLASSICAL|BLUES|POP|ELECTRONIC";
    public CompositionController(Scanner scanner) {
        super(scanner);
    }
    public Composition getCompositionFromUser() {
        return new Composition(getGenreFromUser(),getDurationFromUser(),getNameFromUser());
    }
    public String getNameFromUser() {
        printMenu(new InputMenu(GlobalConstants.NAME));
        return getStringFromUser();
    }
    public Genre getGenreFromUser() {
        printMenu(new InputMenu(GlobalConstants.GENRE));
        String genre = getStringFromUser();
        while(!genre.matches(GENRE_REG_EXP)) {
            printMenu(new ErrorMenu(GlobalConstants.GENRE));
            genre = getScanner().nextLine();
        }
        return Genre.getGenreByName(genre);
    }
    public int getDurationFromUser() {
        printMenu(new InputMenu(GlobalConstants.DURATION));
        return getIntegerFromUser();
    }
}
