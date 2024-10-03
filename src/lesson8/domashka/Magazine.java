package lesson8.domashka;

import java.util.Objects;

public class Magazine extends PrintedPublication {
    private int issueNumber;

    public Magazine() {

    }

    public Magazine(String name, int numbderOfPages, int yearOfIssue, String publisher, int issueNumber) {
        super(name, numbderOfPages, yearOfIssue, publisher);
        this.issueNumber = issueNumber;
    }

    public int getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(int issueNumber) {
        this.issueNumber = issueNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Magazine magazine = (Magazine) o;
        return issueNumber == magazine.issueNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(issueNumber);
    }

    @Override
    public String toString() {
        return  " Журнал { Имя : "+this.getName()+"," +
                " Год выпуска : "+this.getYearOfIssue()+"," +
                " Издатель : "+this.getPublisher()+"," +
                " Количество стрвниц : "+this.getNumbderOfPages()+"," +
                " Номер выпуска (в году) : "+this.getIssueNumber()+"}";
    }
}
