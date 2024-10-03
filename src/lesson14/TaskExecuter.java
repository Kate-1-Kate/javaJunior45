/*
Класс студент

Имя
Фамилия
Отчество
Список оценок
Год рождения
Гражданство
Родной язык
Мобильный телефон

1. Создать 10 студентов
2. Создать список учеников
3. Выставить каждому оценки
4. Отсортировать студентов по фамилии.
5. Отфильтровать студентов по году рождения (не ниже, чем 1999)
6. Отфильтровать студентов по наличию мобильного телефона
//До 6 пункта сделали на занятии, пункт 7, 8 сделать дома

7. Вывести на экран студентов в виде ФИО + средний балл. ДЗ
8. Вывести на экран студентов со средним баллом выше 4 ДЗ

//Продолжим в классе
9. Создать список студентов со средним баллом выше 4, при этом сохранив только ФИО и средний балл
 */
package lesson14;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;

public class TaskExecuter {
    public void execute() {
        //1. Создать 10 студентов
        //2. Создать список учеников
        //3. Выставить каждому оценки
        List<Student> studentsList = getStudentsList(10);
        studentsList.forEach(System.out::println);
        System.out.println("");

        //4. Отсортировать студентов по фамилии.
        studentsList.sort(Comparator.comparing(Student::getSurname));
        System.out.println("");
        studentsList.forEach(System.out::println);

        //5. Отфильтровать студентов по году рождения (не ниже, чем 1999)
        //6. Отфильтровать студентов по наличию мобильного телефона
        var filteredList = getFilterStudentsList(studentsList);
        System.out.println("");
        filteredList.forEach(System.out::println);
    }

    /**
     * Отфильтровать студентов по году рождения (не ниже, чем 1999) и по наличию мобильного телефона
     * @return список студентов соответствующих критериям фильтрации
     */
    private List<Student> getFilterStudentsList(List<Student> studentsList) {
        List<Student> filterList = new ArrayList<>();
        for (Student student : studentsList) {
            if (student.getYearOfBirth() >= 1999 && !student.getMobilePhone().isEmpty()) {
                filterList.add(student);
            }
        }
        return filterList;
    }

    /**
     * Создание списка студентов
     * @return список студент List с классом Student
     */
    private List<Student> getStudentsList(int countOfStudents) {
        List<Student> studentsList = new ArrayList<>();
        for (int i = 0; i < countOfStudents; i++) {
            Student student = new Student();
            student.setName("Name " + i);
            student.setSurname("Surname " + i);
            student.setPatronymic("Patronymic " + i);
            student.setYearOfBirth(ThreadLocalRandom.current().nextInt(1970, 2015 + 1));
            student.setNationality(generateNationality(i));
            student.setNativeLanguage("NativeLanguage " + i);
            student.setMobilePhone(generateMobilePhone(i));
            student.setGrade(generateGradeList());
            studentsList.add(student);
        }

        return studentsList;
    }

    /**
     * Сгенерировать лист оценок
     * @return список оценок
     */
    private List<Integer> generateGradeList() {
        List<Integer> gradeList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            gradeList.add(ThreadLocalRandom.current().nextInt(2, 5 + 1));
        }
        return gradeList;
    }

    /**
     * Сгенерировать мобильный телефон
     * @param i индекс цикла
     * @return мобильный телефон или пустую строку в типе String
     */
    private String generateMobilePhone(int i) {
        if (i < 7) {
            return String.valueOf(
                    ThreadLocalRandom.current().nextLong(890000000, 899999999 + 1)
            );
        } else {
            return "";
        }
    }

    /**
     * Сгенерировать национальность
     * @param i i индекс цикла
     * @return национальность в типе String
     */
    private String generateNationality(int i) {
        if (i < 2) {
            return "Россия";
        } else if (i < 6) {
            return "Греция";
        } else {
            return "Чехия";
        }
    }
    private List<Student> getStudentsWithMore4Mark(List<Student> studentsList) {
//        List<StudentShort> studentsWithMore4Mark = new ArrayList<>();
//        for (Student student : studentsList) {
//            double averageMark = calculateAverageMark(student.getGrade());
//            if (averageMark > 4) {
//                StudentShort studentShort = new StudentShort();
//                studentShort.setAverageMark(averageMark);
//                studentShort.setFio();
//
//            }
//        }
//        return null;
//    }
        List<Student> fillterList = studentsList
                .stream()
                .filter(student -> student.getYearOfBirth() >= 1999 &&
                !student.getMobilePhone().isEmpty())
                        .collect(Collectors.toList());
        return fillterList;
        
                
    }

    private double calculateAverageMark(List<Integer> grade) {
        double countOfMarks = grade.size();
        double cumOfMarks = 0;
        for (Integer mark : grade) {
            cumOfMarks += mark;
        }

        return cumOfMarks / countOfMarks;
    }
    
    
}
