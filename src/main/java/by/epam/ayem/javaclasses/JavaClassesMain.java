package by.epam.ayem.javaclasses;

import by.epam.ayem.javaclasses.model.Student;
import by.epam.ayem.javaclasses.model.StudentBase;
import by.epam.ayem.javaclasses.service.StudentBaseService;

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

public class JavaClassesMain {

    public static void main(String[] args) {
        StudentBase studentBase = new StudentBase();
        StudentBaseService studentBaseService = new StudentBaseService();
        studentBaseService.addStudentToBase(studentBase, new Student(
                "Васько", "Андрей", "Михайлович", 2000,
                "Минск", "2343454", "Военный", 2019, "5465"));
        studentBaseService.addStudentToBase(studentBase, new Student(
                "Пертров", "Анатолий", "Сергеевич", 2001,
                "Минск", "2506978", "Военный", 2019, "5465"));
        studentBaseService.addStudentToBase(studentBase, new Student(
                "Смирнова", "Анна", "Викторовна", 1996,
                "Гродно", "2506978", "Исторический", 2017, "3454"));
        studentBaseService.addStudentToBase(studentBase, new Student(
                "Васин", "Петр", "Андреевич", 2000,
                "Береза", "2469705", "Исторический", 2017, "3454"));
        studentBaseService.addStudentToBase(studentBase, new Student(
                "Семко", "Василий", "Дмитриевич", 1998,
                "Мозырь", "2406986", "Химический", 2018, "4587"));
        studentBaseService.addStudentToBase(studentBase, new Student(
                "Семашко", "Светлана", "Устиновна", 1997,
                "Брест", "2306857", "Химический", 2018, "4587"));
        studentBaseService.addStudentToBase(studentBase, new Student(
                "Азарьева", "Виктория", "Петровна", 2000,
                "Слоним", "2596849", "Химический", 2019, "4588"));
        studentBaseService.addStudentToBase(studentBase, new Student(
                "Алексашенко", "Миксим", "Олегович", 2000,
                "Витебск", "2058476", "Механико-математический", 2018, "4534"));
        studentBaseService.addStudentToBase(studentBase, new Student(
                "Санчез", "Алехандро", "Курьезович", 1998,
                "Брест", "2580475", "Механико-математический", 2018, "4534"));
        studentBaseService.addStudentToBase(studentBase, new Student(
                "Скрипко", "Оксана", "Викторовна", 1998,
                "Мозырь", "2846754", "Механико-математический", 2017, "4532"));

//        studentBaseService.showStudentsByFaculty(studentBase,"Исторический");
//        studentBaseService.showStudentsByGroup(studentBase, "4587");
//        studentBaseService.showStudentsYoungerThanYear(studentBase, 2000);
//        studentBaseService.showAllStudents(studentBase);
    }
}
