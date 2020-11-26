package edu.nf.demo.dao;

import edu.nf.demo.entity.Books;
import edu.nf.demo.util.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import java.util.List;

/**
 * @author 谦煦
 * @2020/11/12
 */
public class BooksDaoImpl implements BooksDao{
    @Override
    public List<Books> listBooks(Books books) {
        try(SqlSession sqlSession = MybatisUtils.getSqlSession(true)){
            return sqlSession.getMapper(BooksDao.class).listBooks(books);
        }catch (RuntimeException e){
            throw e;
        }
    }

    @Override
    public void add(Books books) {
        try(SqlSession sqlSession = MybatisUtils.getSqlSession(true)){
            BooksDao booksDao = sqlSession.getMapper(BooksDao.class);
            booksDao.add(books);
        }catch (RuntimeException e){
            throw e;
        }
    }

    @Override
    public void update(Books books) {
        try(SqlSession sqlSession = MybatisUtils.getSqlSession(true)){
            BooksDao booksDao = sqlSession.getMapper(BooksDao.class);
            booksDao.update(books);
        }catch (RuntimeException e){
            throw e;
        }
    }

    @Override
    public void delete(int id) {
        try(SqlSession sqlSession = MybatisUtils.getSqlSession(true)){
            BooksDao booksDao = sqlSession.getMapper(BooksDao.class);
            booksDao.delete(id);
        }catch (RuntimeException e){
            throw e;
        }
    }

    @Override
    public void delBatch(int[] ids) {
        try(SqlSession sqlSession = MybatisUtils.getSqlSession(true)){
            BooksDao booksDao = sqlSession.getMapper(BooksDao.class);
            booksDao.delBatch(ids);
        }catch (RuntimeException e){
            throw e;
        }
    }

    @Override
    public List<Books> someBooks(Books books) {
        try(SqlSession sqlSession = MybatisUtils.getSqlSession(true)){
            return sqlSession.getMapper(BooksDao.class).someBooks(books);
        }catch (RuntimeException e){
            throw e;
        }
    }
}
