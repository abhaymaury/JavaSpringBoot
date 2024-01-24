package com.learn.UserService.Service;

import com.learn.UserService.entity.User;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface UserService {

    User saveUser(User user);
    List<User> getAllUser();
    User getUser(String id);
    void deleteUser(String id);
    User updateUser (User user);
}
