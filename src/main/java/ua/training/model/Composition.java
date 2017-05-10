package ua.training.model;

public class Composition {
    private Genre genre;
    private double duration;
    private String name;

    public Composition(Genre genre, double duration, String name) {
        this.genre = genre;
        this.duration = duration;
        this.name = name;
    }

    public Genre getGenre() {
        return genre;
    }

    public double getDuration() {
        return duration;
    }

    public String getName() {
        return name;
    }
    public boolean isSuitableDuration(double minDuration,double maxDuration) {
        return duration >= minDuration && duration <= maxDuration;
    }
}
