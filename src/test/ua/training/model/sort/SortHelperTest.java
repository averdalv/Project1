package ua.training.model.sort;

import org.junit.Assert;
import org.junit.Test;
import ua.training.model.Composition;
import ua.training.model.Genre;
import ua.training.model.sort.compare.DurationComparator;
import ua.training.model.sort.compare.GenreComparator;

import java.util.LinkedList;
import java.util.List;

public class SortHelperTest {
    @Test
    public void testGetSortedCompositionWithDurationComparator() {
        SortHelper sortHelper = new SortHelper(new DurationComparator());
        List<Composition> compositions = new LinkedList<Composition>();
        compositions.add(new Composition(Genre.BLUES,300,"Let it snow"));
        compositions.add(new Composition(Genre.POP,310,"Yesterday"));
        compositions.add(new Composition(Genre.ROCK,270,"Smells like teen spirit"));
        compositions = sortHelper.getSortedCompositions(compositions);
        Assert.assertTrue(compositions.get(0).getDuration()==270&&compositions.get(1).getDuration()==300&&compositions.get(2).getDuration()==310);
    }
    @Test
    public void testGetSortedCompositionWithGenreComparator() {
        SortHelper sortHelper = new SortHelper(new GenreComparator());
        List<Composition> compositions = new LinkedList<Composition>();
        compositions.add(new Composition(Genre.BLUES,300,"Let it snow"));
        compositions.add(new Composition(Genre.POP,310,"Yesterday"));
        compositions.add(new Composition(Genre.ROCK,270,"Smells like teen spirit"));
        compositions = sortHelper.getSortedCompositions(compositions);
        Assert.assertTrue(compositions.get(0).getGenre().equals(Genre.ROCK)&&compositions.get(1).getGenre().equals(Genre.BLUES)
                &&compositions.get(2).getGenre().equals(Genre.POP));

    }
}
