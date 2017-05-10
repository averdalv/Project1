package ua.training.model;

import ua.training.model.sort.SortHelper;
import ua.training.model.sort.compare.ComparatorMaker;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Disk {
    private List<Composition> compositions;

    public Disk() {
        compositions = new LinkedList<Composition>();
    }
    public Disk(List<Composition> compositions) {
        this.compositions = compositions;
    }
    public boolean addComposition(Composition composition) {
        return compositions.add(composition);
    }
    public boolean removeComposition(Composition composition) {
        return compositions.remove(composition);
    }
    public double getCommonDuration() {
        double commonDuration=0;
        for(Composition composition:compositions) {
            commonDuration += commonDuration;
        }
        return commonDuration;
    }
    public void sortCompositions(Comparator<Composition> comparator) {
        SortHelper helper = new SortHelper(comparator);
        compositions = helper.getSortedCompositions(compositions);
    }
    public List<Composition> getCompositionsWithSuitableDuration(int minDuration,int maxDuration) {
        List<Composition> suitableCompositions = new LinkedList<Composition>();
        for(Composition composition : compositions) {
            if(composition.isSuitableDuration(minDuration,maxDuration)) {
                suitableCompositions.add(composition);
            }
        }
        return suitableCompositions;
    }
}
