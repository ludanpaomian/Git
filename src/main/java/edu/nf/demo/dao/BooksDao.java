package edu.nf.demo.dao;

import edu.nf.demo.entity.Books;
import java.util.List;

/**
 * @author 谦煦
 * @2020/11/12
 */
public interface BooksDao {
    /**
     * 查询
     * @param books
     * @return
     */
    List<Books> listBooks(Books books);

    /**
     * 添加
     * @param books
     */
    void add(Books books);

    /**
     * 修改
     */
    void update(Books books);

    /**
     * 删除
     * @param id
     */
    void delete(int id);

    /**
     * 批量删除
     */
    void delBatch(int[] ids);

    /**
     * 动态查询
     */
    List<Books> someBooks(Books books);
}
