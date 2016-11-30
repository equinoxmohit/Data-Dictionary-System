/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mohit.datadictionarysystem.controller;

import com.mohit.datadictionarysystem.DAO.AuthorDAO;
import java.sql.SQLException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Mohit
 */
@Controller
@RequestMapping(value = "/display")
public class AuthorDisplayController {
    
    @Autowired
    AuthorDAO authorDao;
    
    @RequestMapping(method = RequestMethod.GET)
    public String doGet(Model model){
   try{
        model.addAttribute("authors", authorDao.getAll());
   }catch(SQLException|ClassNotFoundException ex){
       ex.getStackTrace();
   } 
   return "display";
    }
    
}
