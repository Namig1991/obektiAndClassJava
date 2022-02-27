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

    public String getBookName() {
        return bookName;
    }

    public Author getAuthor() {
        return author;
    }

    public int getYearPublishBook() {
        return yearPublishBook;
    }

    public void setYearPublishBook(int yearPublishBook) {
        this.yearPublishBook = yearPublishBook;
    }
}
