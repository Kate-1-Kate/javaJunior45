package lesson8.domashka;

import java.util.Objects;

public class PrintedPublication {
    private String name;
    private int numbderOfPages;
    private int yearOfIssue;
    private String publisher;

    public PrintedPublication() {
    }

    public PrintedPublication(String name, int numbderOfPages, int yearOfIssue, String publisher) {
        this.name = name;
        this.numbderOfPages = numbderOfPages;
        this.yearOfIssue = yearOfIssue;
        this.publisher = publisher;
    }

    public String getName() {
        return name;
    }

    public int getNumbderOfPages() {
        return numbderOfPages;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumbderOfPages(int numbderOfPages) {
        this.numbderOfPages = numbderOfPages;
    }

    public void setYearOfIssue(int yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PrintedPublication that = (PrintedPublication) o;
        return numbderOfPages == that.numbderOfPages && yearOfIssue == that.yearOfIssue && Objects.equals(name, that.name) && Objects.equals(publisher, that.publisher);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, numbderOfPages, yearOfIssue, publisher);
    }

    @Override
    public String toString() {
        return "Печатные издания {" +
                " Название = '" + name + '\'' +
                ", Количество страниц = " + numbderOfPages +
                ", Год выпуска = " + yearOfIssue +
                ", Издательство = '" + publisher + '\'' +
                '}'+ "\n";

    }
}
