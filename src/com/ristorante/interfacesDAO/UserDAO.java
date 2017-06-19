package com.ristorante.interfacesDAO;

import java.util.ArrayList;

import com.ristorante.model.*;

public interface UserDAO {
	public ArrayList<UserModel> getAllUser();
	public UserModel getUser(String username);
	public void updateUser(String password,String privilegi);
	public void insertUser(String username,String password,String privilegi);
	public boolean deleteUser(String username,String password,String privilegi);
}
