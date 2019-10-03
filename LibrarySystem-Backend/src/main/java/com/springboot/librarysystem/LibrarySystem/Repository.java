package com.springboot.librarysystem.LibrarySystem;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface Repository extends CrudRepository<Books, Integer> {
    List <Books> findAllByBookId(int bookId);

    List<Books> findByDiMonthAndDiYear(int diMonth, int diYear);

    List<Books> findByDiMonthContaining(int diMonth);

    List<Books> findByDiYearContaining(int diYear);

    List<Books> findByAuthorLastName(String authorLastName);

    List<Books> findByAuthorFirstName(String authorFirstName);

    List<Books> findByAuthorFirstNameAndAuthorLastName(String authorFirstName, String authorLastName);
}
