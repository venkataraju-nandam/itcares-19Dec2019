package com.org.app.poc.itcares.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.org.app.poc.itcares.UserDefinedException;
import com.org.app.poc.itcares.bean.UserEntity;
import com.org.app.poc.itcares.service.UserService;

@RestController
@RequestMapping("/fw-users")
public class UserAPI 
{
    @Autowired
    UserService userService;
 
    @GetMapping
    public ResponseEntity<List<UserEntity>> getAllUsers() {
        List<UserEntity> list = userService.getAllUsers();
 
        return new ResponseEntity<List<UserEntity>>(list, new HttpHeaders(), HttpStatus.OK);
    }
 
    @GetMapping("/{id}")
    public ResponseEntity<UserEntity> getUserById(@PathVariable("id") Long id) 
                                                    throws UserDefinedException {
        UserEntity entity = userService.getUserById(id);
 
        return new ResponseEntity<UserEntity>(entity, new HttpHeaders(), HttpStatus.OK);
    }
 
//    @PostMapping
//    public ResponseEntity<UserEntity> createOrUpdateUser(UserEntity user)
//                                                    throws UserDefinedException {
//        UserEntity updated = userService.createOrUpdateUser(user);
//        return new ResponseEntity<UserEntity>(updated, new HttpHeaders(), HttpStatus.OK);
//    }
    
    @PostMapping("/user")
    public ResponseEntity create(@RequestBody UserEntity user) {
        return ResponseEntity.ok(userService.save(user));
    }
 
    @DeleteMapping("/user/{id}")
    public HttpStatus deleteUserById(@PathVariable("id") Long id) 
                                                    throws UserDefinedException {
        userService.deleteUserById(id);
        return HttpStatus.FORBIDDEN;
    }
 
}


// http://localhost:8181/fw-users/999
//http://localhost:8181/fw-users/