package ua.training.model.sort.compare;

import ua.training.model.Composition;

import java.util.Comparator;

public class NameComparatorMaker implements ComparatorMaker {
    public Comparator<Composition> createComparator() {
        return new NameComparator();
    }
}
