package model.service;

public class People {
    protected String firstName;  // создаем защищенное поле

    protected String lastName;

    protected String patronymic;

    public People(String firstname, String lastName, String patronymic) {
        this.firstName = firstname;    // сеттер поля
        this.lastName = lastName;      // сеттер поля
        this.patronymic = patronymic;   // сеттер поля
    }
    public String getFirstName() {
        return this.firstName;    //геттер поля firstName
    }
    public String getLastName() {
        return this.lastName;   //геттер поля lastName
    }
    public String getPatronymic() {
        return this.patronymic;    //геттер поля  patronymic
    }
}
