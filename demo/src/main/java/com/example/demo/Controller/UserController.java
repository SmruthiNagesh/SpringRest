package com.example.demo.Controller;


import com.example.demo.Bean.User;
import com.example.demo.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/getallusers")
    List<User> getallusers(){
        List<User> userList = userService.getUser();
        return userList;
    }

    @GetMapping("/getuserbyid/{id}")
    User getuser(@PathVariable("id") int id){
        return userService.getUserById(id);
    }

    @PostMapping("/adduser")
    User addUser(@RequestBody User user){
        return userService.addUser(user);
    }

    @PutMapping("/updateuser")
    User updateUser(@RequestBody User user){
        return userService.updateUser(user);
    }

    @DeleteMapping("/deleteuserbyid/{id}")
    void deleteUser(@PathVariable("id") int id){
        userService.deleteUser(id);
    }
}
