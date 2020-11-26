package edu.nf.demo.controller;

import edu.nf.demo.dao.BooksDao;
import edu.nf.demo.dao.BooksDaoImpl;
import edu.nf.demo.entity.Books;
import org.nf.mvc.core.WebRequest;
import org.nf.mvc.view.JsonView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author 谦煦
 * @date 2020/11/12
 */
public class BooksController  {
    @WebRequest("/list")
    public JsonView getBooksList(Books books) {
        BooksDao dao = new BooksDaoImpl();
        List<Books> list = dao.listBooks(books);
        return new JsonView(list);
    }

    @WebRequest("/list1")
    public JsonView someBooks(Books books) {
        BooksDao dao = new BooksDaoImpl();
        List<Books> list1 = dao.someBooks(books);
        return new JsonView(list1);
    }

    @WebRequest("/add")
    public void addBooks(Books books) {
        try {
            BooksDao dao = new BooksDaoImpl();
            dao.add(books);
            new JsonView(books);
        } catch (Exception e) {
            new JsonView(500);
        }
    }

    @WebRequest("/update")
    public void updateBooks(Books books) {
        try {
            BooksDao dao = new BooksDaoImpl();
            dao.update(books);
            new JsonView(books);
        } catch (Exception e) {
            new JsonView(500);
        }
    }

    @WebRequest("/delete")
    public void deleteBooks(int id) {
        try {
            BooksDao dao = new BooksDaoImpl();
            dao.delete(id);
            new JsonView(id);
        } catch (Exception e) {
            new JsonView(500);
        }
    }

    @WebRequest("/delBatch")
    public void delBatch(HttpServletRequest request) {
        String[] strings = request.getParameterValues("chk");
        int[] ids = new int[strings.length];
        for (int i = 0; i < strings.length; i++) {
            ids[i] = Integer.parseInt(strings[i]);
            System.out.println(ids[i]);
        }
        try {
            BooksDao dao = new BooksDaoImpl();
            dao.delBatch(ids);
            new JsonView(200);
        } catch (Exception e) {
            new JsonView(500);
        }
    }
}
