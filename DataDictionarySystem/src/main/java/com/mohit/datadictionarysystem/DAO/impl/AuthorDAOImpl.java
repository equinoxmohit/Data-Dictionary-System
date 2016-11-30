/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mohit.datadictionarysystem.DAO.impl;

import com.mohit.datadictionarysystem.DAO.AuthorDAO;
import com.mohit.datadictionarysystem.entity.Author;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Mohit
 */
@Repository(value = "authorDao")
public class AuthorDAOImpl implements AuthorDAO {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public int insert(Author author) throws SQLException, ClassNotFoundException {
        String sql = "INSERT INTO tbl_author(author_name,address,phone,fax,email)" + "VALUES(?,?,?,?,?)";
        return jdbcTemplate.update(sql, new Object[]{
            author.getAuthorName(),
            author.getAddress(),
            author.getPhone(),
            author.getFax(),
            author.getEmail()
        });
    }

    @Override
    public int update(Author author) throws SQLException, ClassNotFoundException {
        String sql = "UPDATE tbl_author SET author_name=?,address=?,phone=?,fax=?,email=? WHERE author_id=?";
        return jdbcTemplate.update(sql, new Object[]{
            author.getAuthorName(),
            author.getAddress(),
            author.getPhone(),
            author.getFax(),
            author.getEmail(),
            author.getAuthorId()
        });
    }

    @Override
    public int delete(int id) throws SQLException, ClassNotFoundException {
        String sql="DELETE FROM tbl_author WHERE author_id=?";
        return jdbcTemplate.update(sql,new Object[]{id});
    }

    @Override
    public List<Author> getAll() throws SQLException, ClassNotFoundException {
        String sql="SELECT * FROM tbl_author";
        return jdbcTemplate.query(sql, new RowMapper<Author>() {

            @Override
            public Author mapRow(ResultSet rs, int i) throws SQLException {
                Author author=new Author();
                author.setAuthorId(rs.getInt("author_id"));
                author.setAuthorName(rs.getString("author_name"));
                author.setAddress(rs.getString("address"));
                author.setPhone(rs.getString("phone"));
                author.setFax(rs.getString("fax"));
                author.setEmail(rs.getString("email"));
                return author;
            }
        });
    }

    @Override
    public Author getById(int id) throws SQLException, ClassNotFoundException {
        String sql="SELECT * FROM tbl_author WHERE author_id=?";
        return jdbcTemplate.queryForObject(sql, new Object[]{id}, new RowMapper<Author>() {

            @Override
            public Author mapRow(ResultSet rs, int i) throws SQLException {
               Author author=new Author();
                author.setAuthorId(rs.getInt("author_id"));
                author.setAuthorName(rs.getString("author_name"));
                author.setAddress(rs.getString("address"));
                author.setPhone(rs.getString("phone"));
                author.setFax(rs.getString("fax"));
                author.setEmail(rs.getString("email"));
                return author;
            }
        });
    }

}
