package ua.training.model;

import ua.training.view.util.GlobalConstants;

public class Composition {
    private static final int MIN_DURATION = 0;
    private Genre genre;
    private int duration;
    private String name;

    public Composition(Genre genre, int duration, String name) {
        if(duration < MIN_DURATION) duration = MIN_DURATION;
        this.genre = genre;
        this.duration = duration;
        this.name = name;
    }

    public Genre getGenre() {
        return genre;
    }

    public int getDuration() {
        return duration;
    }

    public String getName() {
        return name;
    }
    public boolean isSuitableDuration(int minDuration,int maxDuration) {
        if(minDuration > maxDuration) throw new IllegalArgumentException();
        return duration >= minDuration && duration <= maxDuration;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Composition)) return false;

        Composition that = (Composition) o;

        if (getDuration() != that.getDuration()) return false;
        if (getGenre() != that.getGenre()) return false;
        return getName().equals(that.getName());

    }

    @Override
    public int hashCode() {
        int result = getGenre().hashCode();
        result = 31 * result + getDuration();
        result = 31 * result + getName().hashCode();
        return result;
    }
    public String toString() {
        return GlobalConstants.NAME + GlobalConstants.COLON + getName()+ GlobalConstants.SPACE +
                GlobalConstants.DURATION+GlobalConstants.COLON + getDuration() + GlobalConstants.SPACE + GlobalConstants.GENRE +
                GlobalConstants.COLON + getGenre().toString();
    }
}
