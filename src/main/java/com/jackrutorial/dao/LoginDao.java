package com.jackrutorial.dao;
import java.util.List;

import com.jackrutorial.model.UserInfo;

import com.jackrutorial.model.BookInfo;

public interface LoginDao {

 UserInfo findUserInfo(String username);
 
 List<String> getUserRoles(String username);
 
 //BOOK STORE
BookInfo findBookInfo(String ISBN);
//BOOK STORE
}
