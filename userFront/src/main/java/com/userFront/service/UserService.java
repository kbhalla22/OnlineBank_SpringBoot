package com.userFront.service;

import java.util.List;
import java.util.Set;

import com.userFront.domain.User;

public interface UserService {
	User findByUsername(String username);

    User findByEmail(String email);

    boolean checkUserExists(String username, String email);

    boolean checkUsernameExists(String username);

    boolean checkEmailExists(String email);
    
   
    
  
    void saveUser (User user); 
    
   

}
