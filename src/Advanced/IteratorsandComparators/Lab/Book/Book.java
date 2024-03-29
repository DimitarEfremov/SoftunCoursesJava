package Advanced.IteratorsandComparators.Lab.Book;

import java.util.Arrays;
import java.util.List;

public class Book {

    String title;
    int year;
    List<String> authors;

    public Book(String title, int year, String... authors) {
        setTitle(title);
        setYear(year);
        setAuthors(authors);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public List<String> getAuthors() {
        return authors;
    }

    public void setAuthors(String[] authors) {
         this.authors = (Arrays.asList(authors));
    }
}
