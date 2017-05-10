package ua.training.model.sort.compare;

import ua.training.model.Composition;

import java.util.Comparator;

public interface ComparatorMaker {
    Comparator<Composition> createComparator();
}
