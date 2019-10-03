package com.springboot.librarysystem.LibrarySystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class Controller {

    @Autowired
    BookImplementations booksBookImplementations;

    @PostMapping(value = "/addingBooks")
    public Books addingBooks(@RequestBody Books books){
        return booksBookImplementations.addingBooks(books);
    }

    @GetMapping(value = "/gettingAllBooks")
    public List<Books> gettingAllBooks(){
        return booksBookImplementations.gettingAllBooks();
    }

    @GetMapping(value = "/gettingBooksById")
    public List<Books> gettingBooksById(@PathVariable int bookId){
        return booksBookImplementations.gettingBooksById(bookId);
    }

    @GetMapping(value = "/gettingByMonthAndYear")
    public List<Books> gettingByMonthAndYear(@PathVariable int diMonth, @PathVariable int diYear){
        return booksBookImplementations.gettingByMonthAndYear(diMonth, diYear);
    }

    @GetMapping(value = "/gettingByMonth")
    public List<Books> gettingByMonth(@PathVariable int diMonth){
        return booksBookImplementations.gettingByMonth(diMonth);
    }

    @GetMapping(value = "/gettingByYear")
    public List<Books> gettingByYear(@PathVariable int diYear){
        return booksBookImplementations.gettingByYear(diYear);
    }

    @GetMapping(value = "gettingByAuthorLastName")
    public List<Books> gettingByAuthorLastName(@PathVariable String authorLastName){
        return booksBookImplementations.gettingByAuthorLastName(authorLastName);
    }

    @GetMapping(value = "/gettingByAuthorFirstName")
    public List<Books> gettingByAuthorFirstName(@PathVariable String authorFirstName){
        return booksBookImplementations.gettingByAuthorFirstName(authorFirstName);
    }

    @GetMapping(value = "/gettingByAuthorFirstNameAndAuthorLastName")
    public List<Books> gettingByAuthorFirstNameAndAuthorLastName(String authorFirstName, String authorLastName){
        return booksBookImplementations.gettingByAuthorFirstNameAndAuthorLastName(authorFirstName, authorLastName);
    }

}
