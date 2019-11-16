package com.jackrutorial.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import com.jackrutorial.model.UserInfo;
import com.jackrutorial.model.BookInfo;

@Repository
public class LoginDaoImpl implements LoginDao {
 
 NamedParameterJdbcTemplate namedParameterJdbcTemplate;
 
 @Autowired
 public void setNamedParameterJdbcTemplate(NamedParameterJdbcTemplate namedParameterJdbcTemplate) {
  this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
 }

 public UserInfo findUserInfo(String username) {
  String sql = "select username,password from users where username = :username";
  
  UserInfo userInfo = namedParameterJdbcTemplate
.queryForObject(sql, getSqlParameterSource(username, ""), new UserInfoMapper());
  
  return userInfo;
 }
 
 private static final class UserInfoMapper implements RowMapper<UserInfo>{

  public UserInfo mapRow(ResultSet rs, int rowNum) throws SQLException {
   String username = rs.getString("username");
   String password = rs.getString("password");
   return new UserInfo(username, password);
  }
  
 }
 
 private SqlParameterSource getSqlParameterSource(String username, String password){
  MapSqlParameterSource parameterSource = new MapSqlParameterSource();
  parameterSource.addValue("username", username);
  parameterSource.addValue("password", password);
  
  return parameterSource;
 }

 //Book Store start
 
 public BookInfo findBookInfo(String ISBN) {
	  String sql = "select title,ISBN from books where ISBN = :ISBN";
	  
	  BookInfo bookInfo = namedParameterJdbcTemplate
	.queryForObject(sql, getSqlParameterSource(ISBN, ""), new BookInfoMapper());
	  
	  return bookInfo;
	 }
	 
	 private static final class BookInfoMapper implements RowMapper<BookInfo>{

	  public BookInfo mapRow(ResultSet rs, int rowNum) throws SQLException {
	   String ISBN = rs.getString("ISBN");
	   String title = rs.getString("title");
	   return new BookInfo(ISBN, title);
	  }
	  
	 }
	 
	 
	 private SqlParameterSource getSqlParameterSource1(String ISBN, String title){
	  MapSqlParameterSource parameterSource1 = new MapSqlParameterSource();
	  parameterSource1.addValue("ISBN", ISBN);
	  parameterSource1.addValue("title", title);
	  
	  return parameterSource1;
	 }
 
 //  Book Store ends
 
 
 
 
 public List<String> getUserRoles(String username) {
  String sql = "select role from user_roles where username = :username";
  
  List<String> roles = namedParameterJdbcTemplate
.queryForList(sql, getSqlParameterSource(username, ""), String.class);
  
  return roles;
 }

}


