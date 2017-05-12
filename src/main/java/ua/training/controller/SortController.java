package ua.training.controller;

import ua.training.model.Composition;
import ua.training.model.Disk;
import ua.training.model.sort.compare.ComparatorMaker;
import ua.training.model.sort.compare.DurationComparatorMaker;
import ua.training.model.sort.compare.GenreComparatorMaker;
import ua.training.model.sort.compare.NameComparatorMaker;
import ua.training.view.menu.SortMenu;

import java.util.Comparator;
import java.util.Scanner;

public class SortController extends Controller{
    private final int genreSortNumber = 1;
    private final int durationSortNumber = 2;
    private final int nameSortNumber = 3;
    public SortController(Scanner scanner) {
        super(scanner);
    }
    public Comparator<Composition> getCompararatorByNumberFromUser(int numberFromUser) {

        ComparatorMaker maker = null;
        if(numberFromUser == genreSortNumber) {
            maker = new GenreComparatorMaker();
        }
        else if(numberFromUser == durationSortNumber) {
            maker = new DurationComparatorMaker();
        }
        else if(numberFromUser == nameSortNumber){
            maker = new NameComparatorMaker();
        }
        return maker.createComparator();
    }

    public void sortCompositions(Disk disk) {
        int itemNumber = getItemNumberFromUser(new SortMenu());
        Comparator<Composition> comparator = getCompararatorByNumberFromUser(itemNumber);
        disk.sortCompositions(comparator);
    }
}
