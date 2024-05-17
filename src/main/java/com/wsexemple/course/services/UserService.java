package com.wsexemple.course.services;

import com.wsexemple.course.entities.User;
import com.wsexemple.course.repositories.UserRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRespository respository;

    public List<User> findAll() {
        return respository.findAll();
    }

    public User findById(Long id) {
        Optional<User> obj = respository.findById(id);
        return obj.get();
    }
}
