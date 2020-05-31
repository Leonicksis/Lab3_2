package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Book books[] = new Book[5];
        books[0] = new Book(0,"Mem book", new String[]{"Put", "In"}, "BlueHill", 2018, 100, 1200, "hard");
        books[1] = new Book(1,"Old book", new String[]{"Put"}, "RedHill", 1980, 500, 1200, "ulta-soft");
        books[2] = new Book(2,"Neo book", new String[]{"Mark Bookenberg"}, "WhiteHill", 2015, 130, 1200, "hard");
        books[3] = new Book(3,"Book of Book", new String[]{"Big Ralph"}, "WhiteHill", 1993, 100, 1200, "soft");
        books[4] = new Book(4,"Necronomicon?", new String[]{"Satan"}, "HellHill", 666, 666, 666, "human skin");

        Scanner scan = new Scanner(System.in);
        String author = scan.nextLine(); //Ввод автора для поиска
        for (int i = 0; i < books.length; i++){ //
            for (int j = 0; j < books[i].getAuthor().length; j++){
                if (books[i].getAuthor()[j].equals(author)) {
                    System.out.println(books[i]);
                }
            }
        }
        System.out.println();

        String publisher = scan.nextLine(); //Ввод издательства для поиска
        for (int i = 0; i < books.length; i++){ //
            if (books[i].getPublisher().equals(publisher)) {
                System.out.println(books[i]);
            }
        }
        System.out.println();

        int year = scan.nextInt(); //Ввод года для поиска
        for (int i = 0; i < books.length; i++){ //
            if (books[i].getYear() > year) {
                System.out.println(books[i]);
            }
        }

    }
}
