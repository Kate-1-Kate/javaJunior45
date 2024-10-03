package lesson14;

import java.util.List;
import java.util.Objects;

public class Student {
    private String name;
    private String surname;
    private String patronymic;
    private List<Integer> grade;
    private Integer yearOfBirth;
    private String nationality;
    private String nativeLanguage;
    private String mobilePhone;

    public Student() {

    }

    public Student(String name, String mobilePhone, String nativeLanguage, String nationality, Integer yearOfBirth,
                   String patronymic, String surname) {
        this.name = name;
        this.mobilePhone = mobilePhone;
        this.nativeLanguage = nativeLanguage;
        this.nationality = nationality;
        this.yearOfBirth = yearOfBirth;
        this.patronymic = patronymic;
        this.surname = surname;
    }

    public Student(String name, String mobilePhone, String nativeLanguage, String nationality, Integer yearOfBirth,
                   List<Integer> grade, String patronymic, String surname) {
        this.name = name;
        this.mobilePhone = mobilePhone;
        this.nativeLanguage = nativeLanguage;
        this.nationality = nationality;
        this.yearOfBirth = yearOfBirth;
        this.grade = grade;
        this.patronymic = patronymic;
        this.surname = surname;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public List<Integer> getGrade() {
        return grade;
    }

    public void setGrade(List<Integer> grade) {
        this.grade = grade;
    }

    public Integer getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(Integer yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getNativeLanguage() {
        return nativeLanguage;
    }

    public void setNativeLanguage(String nativeLanguage) {
        this.nativeLanguage = nativeLanguage;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) && Objects.equals(surname, student.surname) && Objects.equals(patronymic, student.patronymic) && Objects.equals(grade, student.grade) && Objects.equals(yearOfBirth, student.yearOfBirth) && Objects.equals(nationality, student.nationality) && Objects.equals(nativeLanguage, student.nativeLanguage) && Objects.equals(mobilePhone, student.mobilePhone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, patronymic, grade, yearOfBirth, nationality, nativeLanguage, mobilePhone);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", grade=" + grade +
                ", yearOfBirth=" + yearOfBirth +
                ", nationality='" + nationality + '\'' +
                ", nativeLanguage='" + nativeLanguage + '\'' +
                ", mobilePhone='" + mobilePhone + '\'' +
                '}';
    }
}
