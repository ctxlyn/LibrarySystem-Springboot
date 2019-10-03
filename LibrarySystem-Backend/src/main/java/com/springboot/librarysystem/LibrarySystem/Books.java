package com.springboot.librarysystem.LibrarySystem;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
public class Books {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int bookId;
    @NotNull
    private String bookTitle;
    private String bookGenre;
    @NotNull
    private String authorLastName;
    private String authorFirstName;
    @Temporal(TemporalType.DATE)
    private Date dateIssued;
    private int diMonth;
    private int diYear;

    public Books() {
    }

    public Books(int bookId, @NotNull String bookTitle, String bookGenre, @NotNull String authorLastName, String authorFirstName, Date dateIssued, int diMonth, int diYear) {
        this.bookId = bookId;
        this.bookTitle = bookTitle;
        this.bookGenre = bookGenre;
        this.authorLastName = authorLastName;
        this.authorFirstName = authorFirstName;
        this.dateIssued = dateIssued;
        this.diMonth = diMonth;
        this.diYear = diYear;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getBookGenre() {
        return bookGenre;
    }

    public void setBookGenre(String bookGenre) {
        this.bookGenre = bookGenre;
    }

    public String getAuthorLastName() {
        return authorLastName;
    }

    public void setAuthorLastName(String authorLastName) {
        this.authorLastName = authorLastName;
    }

    public String getAuthorFirstName() {
        return authorFirstName;
    }

    public void setAuthorFirstName(String authorFirstName) {
        this.authorFirstName = authorFirstName;
    }

    public Date getDateIssued() {
        return dateIssued;
    }

    public void setDateIssued(Date dateIssued) {
        this.dateIssued = dateIssued;
    }

    public int getDiMonth() {
        return diMonth;
    }

    public void setDiMonth(int diMonth) {
        this.diMonth = diMonth;
    }

    public int getDiYear() {
        return diYear;
    }

    public void setDiYear(int diYear) {
        this.diYear = diYear;
    }
}
