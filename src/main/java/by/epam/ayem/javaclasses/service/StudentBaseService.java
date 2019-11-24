package by.epam.ayem.javaclasses.service;

import by.epam.ayem.javaclasses.model.Student;
import by.epam.ayem.javaclasses.model.StudentBase;

//Для выполнения достаточно выбрать одно задание.
//Создать классы, спецификации которых приведены ниже. Определить конструкторы и методы setТип(),
//getТип(), toString().
//Определить дополнительно методы в классе, создающем массив объектов. Задать критерий выбора
//данных и вывести эти
//данные на консоль. В каждом классе, обладающем информацией, должно быть объявлено несколько
//конструкторов.
//
//1. Student: id, Фамилия, Имя, Отчество, Дата рождения, Адрес, Телефон, Факультет, Курс, Группа.
//Создать массив объектов. Вывести:
//a) список студентов заданного факультета;
//b) списки студентов для каждого факультета и курса;
//c) список студентов, родившихся после заданного года;
//d) список учебной группы.

/**
 * @author Aleh Yemelyanchyk on 11/5/2019.
 */

public class StudentBaseService {

    public void addStudentToBase(StudentBase studentBase, Student student) {
        studentBase.getStudents().add(student);
    }

    public void showStudentsByFaculty(StudentBase studentBase, String faculty) {
        System.out.println(faculty + " факультет: ");
        for (Student student : studentBase.getStudents()) {
            if (student.getFaculty().equalsIgnoreCase(faculty)) {
                System.out.println(student);
            }
        }
    }

    public void showAllStudents(StudentBase studentBase) {
        System.out.println("Все студенты:");
        for (Student student : studentBase.getStudents()) {
            System.out.println(student);
        }
    }

    public void showStudentsYoungerThanYear(StudentBase studentBase, int year) {
        System.out.println("Студенты, родившиеся после " + year + " года:");
        for (Student student : studentBase.getStudents()) {
            if (student.getYearOfBirth() >= year) {
                System.out.println(student);
            }
        }
    }

    public void showStudentsByGroup(StudentBase studentBase, String group) {
        System.out.println("Группа " + group + ":");
        for (Student student : studentBase.getStudents()) {
            if (student.getGroup().equalsIgnoreCase(group)) {
                System.out.println(student);
            }
        }
    }
}
