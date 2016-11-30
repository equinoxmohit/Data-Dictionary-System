/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mohit.datadictionarysystem.entity;

/**
 *
 * @author Mohit
 */
public class Author {

    private int authorId;
    private String authorName, address, phone, fax, email;

    public Author() {
    }

    public Author(int authorId, String authorName, String address, String phone, String fax, String email) {
        this.authorId = authorId;
        this.authorName = authorName;
        this.address = address;
        this.phone = phone;
        this.fax = fax;
        this.email = email;
    }

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Author{" + "authorId=" + authorId + ", authorName=" + authorName + ", address=" + address + ", phone=" + phone + ", fax=" + fax + ", email=" + email + '}';
    }

}
