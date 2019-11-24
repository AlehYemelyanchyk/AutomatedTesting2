package by.epam.ayem.javaclasses.model;

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

public class Student {
    private String surname;
    private String name;
    private String patronymic;
    private int yearOfBirth;
    private String address;
    private String phoneNumber;
    private String faculty;
    private int year;
    private String group;

    public Student(String surname, String name, String patronymic, int yearOfBirth, String address,
                   String phoneNumber, String faculty, int year, String group) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.yearOfBirth = yearOfBirth;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.faculty = faculty;
        this.year = year;
        this.group = group;
    }

    public Student(String surname, String name, String patronymic, int yearOfBirth, String faculty, String group) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.yearOfBirth = yearOfBirth;
        this.faculty = faculty;
        this.group = group;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
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

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return surname + " " + name + " " + patronymic + ". " + yearOfBirth + ". " + address + ", тел.: " + phoneNumber
                + ". " + faculty + " факультет, " + year + ", гр. " + group + ". ";
    }
}
