package com.ohgiraffers.test.view;

import com.ohgiraffers.test.controller.BookManager;
import com.ohgiraffers.test.model.dto.BookDTO;

import java.util.Scanner;

public class BookMenu {
    private Scanner sc = new Scanner(System.in);
    private BookManager bm = new BookManager();

    public BookMenu() {}

    public void menu() {
        while(true) {
            System.out.println("===== 도서 관리 프로그램 =====");
            System.out.println("1. 도서 추가");
            System.out.println("2. 도서 삭제");
            System.out.println("3. 도서 검색");
            System.out.println("4. 도서 목록");
            System.out.println("0. 프로그램 종료");

            System.out.print("메뉴를 선택하세요 : ");
            int num = sc.nextInt();

            switch(num) {
                case 1 : bm.addBook(inputBook()); break;
                case 2 : bm.deleteBook(); break;
                case 3 : bm.searchBook(inputBookTitle()); break;
                case 4 : bm.displayAll(); break;
                case 0 : System.out.println("프로그램을 종료합니다."); return;
                default : System.out.println("메뉴를 잘못 선택하셨습니다."); break;
            }
        }
    }

    public BookDTO inputBook() {
        System.out.print("도서의 카테고리를 입력하세요 (1.인문 / 2.자연과학 / 3.의료 / 4.기타) : ");
        int category = sc.nextInt();
        sc.nextLine();
        System.out.print("도서 제목을 입력하세요 : ");
        String title = sc.nextLine();
        System.out.print("도서의 저자를 입력하세요 : ");
        String author = sc.nextLine();

        BookDTO book = new BookDTO(category,title, author);
        return book;
    }

    public String inputBookTitle() {
        System.out.print("검색할 도서 제목을 입력하세요 : ");
        String searchTitle = sc.nextLine();

        return searchTitle;
    }
}
