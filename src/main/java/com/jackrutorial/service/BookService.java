package com.jackrutorial.service;

import java.util.List;

import com.jackrutorial.model.BookInfo;

public interface BookService {
	 
	 public List<BookInfo> list();
	 
	 public BookInfo findBookByISBN(String ISBN);
	 
	 public void add(String ISBN, String title);
	 
	 public boolean bookExists(String ISBN);
	}

