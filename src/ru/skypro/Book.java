package ru.skypro;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return getYearPublishBook() == book.getYearPublishBook() && getBookName().equals(book.getBookName()) && getAuthor().equals(book.getAuthor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBookName(), getAuthor(), getYearPublishBook());
    }

    @Override
    public String toString() {
        return "Название книги " + bookName + " Автор книги " + author + " Год издания " + yearPublishBook;
    }
}
