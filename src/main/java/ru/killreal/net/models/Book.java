package ru.killreal.net.models;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Book {

    private int id;
    @NotEmpty(message = "Введите название книги")
    @Size(min = 5,max = 200,message = "Название должно содержать от 5 до 200 символов")
    private String name;
    @NotEmpty(message = "Введите автора книги")
    @Size(min = 5, max = 100,message = "Имя автора не может содержать больше 100 символов")
    private String author;
    //@Pattern(regexp = "\\d{4}",message = "Год выпуска состоит из 4 цифр")
    private int releaseYear;

    public Book() {
    }

    public Book(String name, String author, int releaseYear) {
        this.name = name;
        this.author = author;
        this.releaseYear = releaseYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
