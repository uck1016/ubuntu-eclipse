package com.onlineMediCare.implementation;

import javax.sql.DataSource;

import com.onlineMediCare.mapper.LoginMapper;
import com.onlineMediCare.DAO.LoginDAO;
import com.onlineMediCare.model.LoginDO;
import org.springframework.jdbc.core.JdbcTemplate;

public class LoginDAOImplementation implements LoginDAO {

	private DataSource dataSource;
	   private JdbcTemplate jdbcTemplateObject;
	   
	   public void setDataSource(DataSource dataSource) {
	      this.dataSource = dataSource;
	      this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	   }
	@Override
	public LoginDO AuthenticateUser(LoginDO loginDO) {
		LoginMapper loginMapper = new LoginMapper();
		
		String role = "";
		String query = "select role from login where username = '"+loginDO.getUserName()+"' and password = '"+loginDO.getPassWord()+"'";
		loginDO = (LoginDO)jdbcTemplateObject.queryForObject(query, loginMapper);
		return loginDO;
		
	}
	

}
