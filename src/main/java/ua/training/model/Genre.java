package ua.training.model;

public enum Genre {
    ROCK,JAZZ,CLASSICAL,BLUES,POP,ELECTRONIC;


    public static Genre getGenreByName(String genreName) {
        return Genre.valueOf(genreName);
    }
}
