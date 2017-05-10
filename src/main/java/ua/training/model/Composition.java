package ua.training.model;

public class Composition {
    private Genre genre;
    private int duration;
    private String name;

    public Composition(Genre genre, int duration, String name) {
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
}
