package com.userFront.service.UserServiceImpl;

import java.util.List;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.userFront.Dao.UserDao;
import com.userFront.domain.User;
import com.userFront.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	
	
	@Autowired
	private UserDao userDao;
	
	
	

    public User findByUsername(String username) {
        return userDao.findByUsername(username);
    }

    public User findByEmail(String email) {
        return userDao.findByEmail(email);
    }
    
    
  
    
    public boolean checkUserExists(String username, String email){
        if (checkUsernameExists(username) || checkEmailExists(username)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean checkUsernameExists(String username) {
        if (null != findByUsername(username)) {
            return true;
        }

        return false;
    }
    
    public boolean checkEmailExists(String email) {
        if (null != findByEmail(email)) {
            return true;
        }

        return false;
    }

	@Override
	public void saveUser(User user) {
		// TODO Auto-generated method stub
		 userDao.save(user);
	}



   
}
	
	
	


