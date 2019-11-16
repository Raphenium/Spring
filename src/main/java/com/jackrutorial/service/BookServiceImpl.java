package com.jackrutorial.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jackrutorial.dao.UserDao;
import com.jackrutorial.model.BookInfo;

@Service
public class BookServiceImpl implements BookService{
 
 UserDao userDao;
 
 @Autowired
 public void setUserDao(UserDao userDao) {
  this.userDao = userDao;
 }

 public List<BookInfo> list(){
  return userDao.list1();
 }

 public BookInfo findBookByISBN(String ISBN) {
  return userDao.findBookByISBN(ISBN);
 }

 public void add(String ISBN, String title) {
  userDao.add(ISBN, title);
 }

 public boolean bookExists(String ISBN) {
  return userDao.bookExists(ISBN);
 }

}
