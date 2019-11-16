package com.jackrutorial.dao;

import java.util.List;

import com.jackrutorial.model.UserInfo;
import com.jackrutorial.model.BookInfo;

public interface UserDao {
 
 public List<UserInfo> list();
 
 public UserInfo findUserByUsername(String username);
 
 public void update(String username, String password);
 
 public void add(String username, String password);
 
 public boolean userExists(String username);
 
 
 // BOOK STORE
 
 public List<BookInfo> list1();
 
 public BookInfo findBookByISBN(String ISBN);
 
 public void add1(String ISBN, String title);
 
 public boolean bookExists(String username);
 
}