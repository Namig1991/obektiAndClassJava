package ru.skypro;

import java.sql.SQLOutput;

public class Main {
// №1
    public static void main(String[] args) {
        Book bookNum1 = new Book("Voina i mir", new Author("Lev", "Tolstoy"), 1863);
        Book bookNum2 = new Book("Russia", new Author("Aleksandr","Bloc"), 1909);
        bookNum1.setYearPublishBook(2022);
        System.out.println(bookNum1.getYearPublishBook());

        System.out.println("Authors");
        Author authorNum1 = new Author("Lev", "Tolstoy");
        Author authorNum2 = new Author("Aleksandr", "Bloc");
        System.out.println();

        System.out.println(bookNum1);
        System.out.println(bookNum2);
        System.out.println(authorNum1);
        System.out.println(authorNum2);
    }
}
