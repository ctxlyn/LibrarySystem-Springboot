package com.springboot.librarysystem.LibrarySystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookImplementations {

    @Autowired
    Repository repository;

    public Books addingBooks(Books books){
        return repository.save(books);
    }

    public List<Books> gettingAllBooks(){
        List<Books> allBooks = new ArrayList<>();
        repository.findAll().forEach(allBooks::add);
        return allBooks;
    }

    public List<Books> gettingBooksById(int bookId){
        List<Books> booksById = new ArrayList<>();
        repository.findAllByBookId(bookId).forEach(booksById::add);
        return booksById;
    }

    public List<Books> gettingByMonthAndYear(int diMonth, int diYear){
        List<Books> books = new ArrayList<>();
        repository.findByDiMonthAndDiYear(diMonth, diYear).forEach(books::add);
        return books;
    }

    public List<Books> gettingByMonth(int diMonth){
        List<Books> books = new ArrayList<>();
        repository.findByDiMonthContaining(diMonth).forEach(books::add);
        return books;
    }

    public List<Books> gettingByYear(int diYear){
        List<Books> books = new ArrayList<>();
        repository.findByDiYearContaining(diYear).forEach(books::add);
        return books;
    }

    public List<Books> gettingByAuthorLastName(String authorLastName){
        List<Books> books = new ArrayList<>();
        repository.findByAuthorLastName(authorLastName).forEach(books::add);
        return books;
    }

    public List<Books> gettingByAuthorFirstName(String authorFirstName){
        List<Books> books = new ArrayList<>();
        repository.findByAuthorFirstName(authorFirstName).forEach(books::add);
        return books;
    }

    public List<Books> gettingByAuthorFirstNameAndAuthorLastName(String authorFirstName, String authorLastName){
        List<Books> books = new ArrayList<>();
        repository.findByAuthorFirstNameAndAuthorLastName(authorFirstName, authorLastName).forEach(books::add);
        return books;
    }

}
