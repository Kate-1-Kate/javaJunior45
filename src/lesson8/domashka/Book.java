package lesson8.domashka;

import java.util.Objects;

public class Book extends PrintedPublication {
private String genre;
private String author;

    public Book() {
    }


    public Book(String name, int numbderOfPages, int yearOfIssue, String publisher, String genre, String author) {
        super(name, numbderOfPages, yearOfIssue, publisher);
        this.genre = genre;
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public String getAuthor() {
        return author;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(genre, book.genre) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(genre, author);
    }

    @Override
    public String toString() {
        return  " Книга { Имя : "+this.getName()+"," +
                " Год выпуска : "+this.getYearOfIssue()+"," +
                " Издатель : "+this.getPublisher()+"," +
                " Количество стрвниц : "+this.getNumbderOfPages()+"," +
                " Автор : "+this.getAuthor()+"," +
                " Жанр : "+this.getGenre()+"}";
    }
}
