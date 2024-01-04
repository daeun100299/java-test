package com.ohgiraffers.test.controller;

import com.ohgiraffers.test.model.dto.BookDTO;

import java.awt.print.Book;
import java.util.ArrayList;

public class BookManager {

    public BookManager() {}
    ArrayList<BookDTO> bookArray = new ArrayList<>();

    public void addBook(BookDTO book) {
        bookArray.add(book);
    }

    public void deleteBook(int index) {
        if(index != 0) {
            index--;
        }
    }

    public int searchBook(String title) {
        for(int i = 0; i < bookArray.size(); i++) {

        }
    }

    public void printBook(int index) {

    }

    public void displayAll() {
        for(BookDTO ba : bookArray) {
            System.out.println(ba);
        }
    }

    /*public ArrayList<BookDTO> sortedBookList() {

    }

    public void printBookList(ArrayList<BookDTO> br) {

    }*/
}
