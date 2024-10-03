package lesson15;

import lesson14.Student;

import java.util.function.Consumer;
import java.util.function.Function;

public class GetFioFunction implements Function<Student,String> {

    @Override
    public String apply(Student student) {
        return student.getName() + " " + student.getSurname() + " " + student.getPatronymic();
    }

}
