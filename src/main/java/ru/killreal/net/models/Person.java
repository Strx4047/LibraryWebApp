package ru.killreal.net.models;


import javax.validation.constraints.*;

public class Person {

    private int id;


    @Min(value = 1900, message = "Год рождения не может быть меньше 1900")
    private int yearOfBirth;

    @NotEmpty(message = "Имя не должно быть пустым")
    @Size(max = 100, message = "Максимальный размер должень быть меньше 100 символов")
    //@Pattern(regexp = "[А-Я]\\w+", message = "Ваше имя должно быть в формате: Фамилия Имя Отчество")
    private String name;

    public Person() {
    }

    public Person(String name, int id, int yearOfBirth) {
        this.id = id;
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }
}
