package com.hy.work.topic04;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //图书的属性有：编号，书名，作者，价格。要求提供如下功能：
        //1、提供操作菜单，可以选择要进行的操作。
        //2、可以添加图书，添加图书时，编号需要唯一，添加成功，返回到菜单。
        //3、可以查询图书，显示所有图书信息，然后返回到菜单。
        //4、可以根据书名，查询单本图书信息，显示信息后，返回到菜单。
        //5、可以删除图书，通过编号删除，删除成功后，返回到菜单。
        //6、可以修改图书的信息，但编号不可以修改，修改成功后，返回到菜单。
        //7、可以退出系统，结束程序运行。
        ArrayList<Book> books = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        loop:while (true) {
            System.out.println("欢迎来到图书管理系统");
            System.out.println("1.添加图书");
            System.out.println("2.查询所有图书");
            System.out.println("3.查询单本图书");
            System.out.println("4.删除图书");
            System.out.println("5.修改图书");
            System.out.println("6.退出系统");
            System.out.println("选择要进行的操作(1 - 6)");
            String choice = sc.nextLine();
            switch (choice) {
                case "1" -> addBook(books);
                case "2" -> showAllBooks(books);
                case "3" -> showBook(books);
                case "4" -> deleteBook(books);
                case "5" -> updateBook(books);
                case "6" -> {
                    break loop;
                }
                default -> System.out.println("输入错误，请重新输入");
            }
        }
    }

    public static void addBook(ArrayList<Book> books) {
        Scanner sc = new Scanner(System.in);
        Book book = new Book();
        String id;
        while (true) {
            System.out.println("请输入id:");
            id = sc.next();
            if (getIndex(books, id) != -1) {
                System.out.println("id已存在，请重新输入");
            } else {
                book.setId(id);
                break;
            }
        }
        System.out.println("请输入书名:");
        book.setName(sc.next());
        System.out.println("请输入作者:");
        book.setAuthor(sc.next());
        double price;
        while (true) {
            System.out.println("请输入价格:");
            price = sc.nextDouble();
            if (price < 0) {
                System.out.println("价格错误，请重新输入");
            } else {
                book.setPrice(price);
                break;
            }
        }
        books.add(book);
    }

    public static void showAllBooks(ArrayList<Book> books) {
        //3、可以查询图书，显示所有图书信息，然后返回到菜单。
        for (int i = 0; i < books.size(); i++) {
            System.out.println("id:" + books.get(i).getId() + "\t name:" + books.get(i).getName() + "\t author:" + books.get(i).getAuthor() + "\t price:" + books.get(i).getPrice());
        }
    }

    public static void showBook(ArrayList<Book> books) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要查询的书名:");
        String name = sc.next();
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getName().equals(name)) {
                System.out.println("id:" + books.get(i).getId() + "\t name:" + books.get(i).getName() + "\t author:" + books.get(i).getAuthor() + "\t price:" + books.get(i).getPrice());
                return;
            }
        }
        System.out.println("不存在" + name + "这本书");
    }

    public static void deleteBook(ArrayList<Book> books) {
        //5、可以删除图书，通过编号删除，删除成功后，返回到菜单。
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要删除的id:");
        String id = sc.next();
        if (getIndex(books, id) != -1) {
            books.remove(getIndex(books, id));
            System.out.println("删除成功");
        } else {
            System.out.println("id不存在");
        }
    }

    public static void updateBook(ArrayList<Book> books) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要修改的id:");
        String id = sc.next();
        if (getIndex(books, id) != -1) {
            Book book = books.get(getIndex(books, id));
            System.out.println("请输入修改后的书名:");
            book.setName(sc.next());
            System.out.println("请输入作者:");
            book.setAuthor(sc.next());
            double price;
            while (true) {
                System.out.println("请输入价格:");
                price = sc.nextDouble();
                if (price < 0) {
                    System.out.println("价格错误，请重新输入");
                } else {
                    book.setPrice(price);
                    break;
                }
            }
        } else {
            System.out.println("id不存在");
        }
    }

    public static int getIndex(ArrayList<Book> books, String id) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getId().equals(id)) {
                return i;
            }
        }
        return -1;
    }
}
