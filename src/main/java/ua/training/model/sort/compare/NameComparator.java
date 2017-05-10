package ua.training.model.sort.compare;

import ua.training.model.Composition;

import java.util.Comparator;

public class NameComparator implements Comparator<Composition> {
    public int compare(Composition firstComposition, Composition secondComposition) {
        return firstComposition.getName().compareTo(secondComposition.getName());
    }
}
