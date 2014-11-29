package com.onlineMediCare.DAO;

import com.onlineMediCare.model.LoginDO;

public interface LoginDAO {
 
	public LoginDO AuthenticateUser(LoginDO loginDO);
	
}
