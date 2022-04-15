package com.example.demo.Service;

import com.example.demo.Bean.User;
import com.example.demo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository repository;

    public List<User> getUser(){
        List<User> userList = new ArrayList<>();
        repository.findAll().forEach(x->userList.add(x));
        return userList;
    }

    public User getUserById(int id){
        return repository.findById(id).get();
    }

    public User addUser(User user){
        User u = repository.save(user);
        return u;
    }

    public User updateUser(User user){
        User u =repository.save(user);
        return u;
    }

    public void deleteUser(int id){
        repository.deleteById(id);
    }

}
