package edu.nf.demo.test;

import edu.nf.demo.dao.BooksDao;
import edu.nf.demo.dao.BooksDaoImpl;
import edu.nf.demo.entity.Books;
import org.junit.Test;
import java.util.List;

public class BooksDaoTest {
    @Test
    public void Add() {
        Books books = new Books();
        books.setName("vue");
        books.setAuthor("abc");
        books.setPrice(78);
        BooksDao dao = new BooksDaoImpl();
        dao.add(books);
    }

    @Test
    public void Update() {
        Books books = new Books();
        books.setId(1006);
        books.setName("js");
        books.setAuthor("aos");
        books.setPrice(99);
        BooksDao dao = new BooksDaoImpl();
        dao.update(books);
    }

    @Test
    public void Delete(){
        BooksDao dao = new BooksDaoImpl();
        dao.delete(1003);
    }

    @Test
    public void DelBatch() {
        int[] ids = {1004, 1006};
        BooksDao dao = new BooksDaoImpl();
        dao.delBatch(ids);
    }

    @Test
    public void ListBooksTest() {
        Books books = new Books();
        BooksDao dao = new BooksDaoImpl();
        List<Books> list = dao.listBooks(books);
        list.forEach(books1 -> System.out.println(books1.getName()));
    }

    @Test
    public void someBooksTest(){
        Books books = new Books();
        books.setName("vue");
        BooksDao dao = new BooksDaoImpl();
        List<Books> list = dao.someBooks(books);
        list.forEach(books1 -> {
            System.out.println(books1.getAuthor());
        });
        list.forEach(books1 -> System.out.println(books1.getPrice()));
    }
}
