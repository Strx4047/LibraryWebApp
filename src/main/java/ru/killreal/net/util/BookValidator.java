package ru.killreal.net.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import ru.killreal.net.dao.BookDAO;
import ru.killreal.net.models.Book;
@Component
public class BookValidator implements Validator {

    private final BookDAO bookDAO;
    @Autowired
    public BookValidator(ru.killreal.net.dao.BookDAO bookDAO) {
        this.bookDAO = bookDAO;
    }

    @Override
    public boolean supports(Class<?> aClass) {
        return Book.class.equals(aClass);
    }

    @Override
    public void validate(Object o, Errors errors) {
        Book book = (Book) o;
        if(bookDAO.show(book.getName()).isPresent()) {
            errors.rejectValue("name","","Такая книга уже существует");
        }
    }
}
