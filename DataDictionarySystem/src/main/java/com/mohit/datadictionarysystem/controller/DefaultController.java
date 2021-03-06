/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mohit.datadictionarysystem.controller;

import com.mohit.datadictionarysystem.DAO.AuthorDAO;
import com.mohit.datadictionarysystem.entity.Author;
import java.sql.SQLException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Mohit
 */
@Controller
@RequestMapping(value = "/")
public class DefaultController {

    @Autowired
    AuthorDAO authorDao;

    @RequestMapping(method = RequestMethod.GET)
    public String doGet() {
        return "index";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String doPost(Author author) {
        try {
            if (authorDao.insert(author) > 0) {
                return "redirect:/?success";
            }
        } catch (SQLException | ClassNotFoundException ex) {
            ex.getStackTrace();
        }
        return "redirect:/?error";
    }

}
