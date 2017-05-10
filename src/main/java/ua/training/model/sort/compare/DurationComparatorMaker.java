package ua.training.model.sort.compare;

import ua.training.model.Composition;

import java.util.Comparator;

public class DurationComparatorMaker implements ComparatorMaker {
    public Comparator<Composition> createComparator() {
        return new DurationComparator();
    }
}
