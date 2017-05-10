package ua.training.model.sort.compare;

import ua.training.model.Composition;

import java.util.Comparator;

public class GenreComparator implements Comparator<Composition> {
    public int compare(Composition firstComposition, Composition secondComposition) {
       return firstComposition.getGenre().ordinal()-secondComposition.getGenre().ordinal();
    }
}
