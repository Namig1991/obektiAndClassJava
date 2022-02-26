package ru.skypro;

public class Book {
    private String bookName;
    private Author author;
    private int yearPublishBook;

    public Book (String bookName, Author author, int yearPublishBook) {
        this.bookName = bookName;
        this.author = author;
        this.yearPublishBook = yearPublishBook;
    }

}
