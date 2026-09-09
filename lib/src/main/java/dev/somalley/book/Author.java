package dev.somalley.book;


public class Author {
    String name, surname;
    int rating;

    public Author(String name, String surname, int rating) {
        this.name = name;
        this.surname = surname;
        this.rating = rating;
    }

    public int getRating() {
        return this.rating;
    }

    public boolean matches(String word) {
        return this.name.contains(word) || this.surname.contains(word);
    }
}
