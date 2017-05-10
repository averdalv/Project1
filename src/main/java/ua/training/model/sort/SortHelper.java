package ua.training.model.sort;


import ua.training.model.Composition;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortHelper {
    private Comparator<Composition> comparator;

    public SortHelper(Comparator<Composition> comparator) {
        setComparator(comparator);
    }
     public List<Composition> getSortedCompositions(List<Composition> compositions) {
         Collections.sort(compositions,comparator);
         return compositions;
     }
     public void setComparator(Comparator<Composition> comparator) {
         this.comparator = comparator;
     }
}
