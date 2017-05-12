package ua.training.model;

import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

public class DiskTest {
    @Test
    public void testGetCompositionsWithSuitableDuration() {
        List<Composition> compositions= new LinkedList<Composition>();
        int minDuration=140;
        int maxDuration=200;
        compositions.add(new Composition(Genre.POP,120,"First"));
        compositions.add(new Composition(Genre.ROCK,150,"Second"));
        compositions.add(new Composition(Genre.CLASSICAL,190,"Third"));
        compositions.add(new Composition(Genre.BLUES,201,"Fourth"));
        List<Composition> expectedCompositions= new LinkedList<Composition>();
        expectedCompositions.add(new Composition(Genre.ROCK,150,"Second"));
        expectedCompositions.add(new Composition(Genre.CLASSICAL,190,"Third"));
        List<Composition> result = new Disk(compositions).getCompositionsWithSuitableDuration(minDuration,maxDuration);
        Assert.assertArrayEquals(expectedCompositions.toArray(),result.toArray());
    }
}
