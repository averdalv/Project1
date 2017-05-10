package ua.training.model.sort.compare;

import ua.training.model.Composition;

import java.util.Comparator;

public class DurationComparator implements Comparator<Composition>{
    public int compare(Composition firstComposition, Composition secondComposition) {
        if(firstComposition.getDuration() < secondComposition.getDuration()) {
            return -1;
        }
        else if(firstComposition.getDuration() > secondComposition.getDuration()) {
            return 1;
        }
        else {
            return 0;
        }
    }
}
