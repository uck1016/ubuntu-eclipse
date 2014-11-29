package com.onlineMediCare.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;


import org.springframework.jdbc.core.RowMapper;

import com.onlineMediCare.model.LoginDO;
public class LoginMapper implements RowMapper {

	public LoginDO mapRow(ResultSet resultSet, int rowNumber) throws SQLException {
		
		String role = resultSet.getString("role");
		LoginDO loginDO = new LoginDO();
		loginDO.setRole(role);
		return loginDO;
	}

}
