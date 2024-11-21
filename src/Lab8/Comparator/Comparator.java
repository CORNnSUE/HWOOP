package Comparator;

import java.util.*;

class Movie implements Comparable<Movie>{
    private double rating;
    private String name;
    private int year;

    public int compareTo(Movie m) {
        return this.year - m.year;
    }

    public Movie(String name, double rating, int year) {
        this.name = name;
        this.rating = rating;
        this.year = year;
    }

    public double getRating() {
        return rating;
    }
    public String getName() {
        return name;
    }
    public int getYear() {
        return year;
    }
}

class NameCompare implements Comparator<Movie> {
    public int compare(Movie left, Movie right) {
        return left.getName().compareTo(right.getName());
    }
}

class RatingCompare implements Comparator<Movie> {
    public int compare(Movie left, Movie right) {
        if (left.getRating() < right.getRating()) {
            return -1;
        }
        if (left.getRating() > right.getRating()) {
            return 1;
        } else {
            return 0;
        }
    }
}

class  ComparatorTest {
    public static void main(String[] args) {
        ArrayList<Movie> list = new ArrayList<Movie>();
        list.add(new Movie("Force Awakens", 8.3, 2015));
        list.add(new Movie("Star Wars", 8.7, 1977));
        list.add(new Movie("Empire Strikes Back", 8.8, 1980));
        list.add(new Movie("Return of the Jedi", 8.4, 1983));

        System.out.println("Sorted by rating");
        RatingCompare ratingCompare = new RatingCompare();
        Collections.sort(list, ratingCompare);
        for (Movie movie: list) {
            System.out.println(movie.getRating() + " " + movie.getName() + " " +
                    movie.getYear());
        }

        System.out.println("\nSorted by name");
        NameCompare nameCompare = new NameCompare();
        Collections.sort(list, nameCompare);
        for (Movie movie: list) {
            System.out.println(movie.getName() + " " + movie.getRating() + " " +
                    movie.getYear());
        }

        System.out.println("\nSorted by year");
        Collections.sort(list);
        for (Movie movie: list) {
            System.out.println(movie.getYear() + " " + movie.getRating() + " " +
                    movie.getName() + " ");
        }
    }
}

