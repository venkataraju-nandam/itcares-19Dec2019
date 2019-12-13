package com.org.app.poc.itcares.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.app.poc.itcares.UserDefinedException;
import com.org.app.poc.itcares.bean.UserEntity;
import com.org.app.poc.itcares.repository.UserRepository;

/**
 * @author Venkata.Nandam
 * This UserService class performas the operations of UserEntity
 *
 */
@Service
public class UserService implements IUserService {

    @Autowired
    UserRepository repository;
     
    /**
     * @return
     *This method retrieves and returns all User Objects exists
     */
    public List<UserEntity> getAllUsers()
    {
        List<UserEntity> userList = repository.findAll();
         
        if(userList.size() > 0) {
            return userList;
        } else {
            return new ArrayList<UserEntity>();
        }
    }
    
    /**
     * @param id
     * @return
     * @throws UserDefinedException
     * This method retrieves and return the specified User Object
     */
    public UserEntity getUserById(Long id) throws UserDefinedException 
    {
        Optional<UserEntity> user = repository.findById(id);
         
        if(user.isPresent()) {
            return user.get();
        } else {
            throw new UserDefinedException("No user record exist for given id");
        }
    }
    
    
    public UserEntity createOrUpdateUser(UserEntity entity) throws UserDefinedException 
    {
        Optional<UserEntity> user = repository.findById(entity.getId());
        if(user.isPresent()) 
        {
       
            UserEntity newUser = user.get();
         
            newUser.setFirstName(entity.getFirstName());
            newUser.setLastName(entity.getLastName());
            newUser.setId(entity.getId());
            newUser.setUsername(entity.getUsername());
 
            newUser = repository.save(newUser);
             
            return newUser;
        } else {
            entity = repository.save(entity);
             
            return entity;
        }
    }
    
    public void deleteUserById(Long id) throws UserDefinedException 
    {
        Optional<UserEntity> user = repository.findById(id);
         
        if(user.isPresent()) 
        {
            repository.deleteById(id);
        } else {
            throw new UserDefinedException("No User record exist for given id");
        }
    }
    
}
