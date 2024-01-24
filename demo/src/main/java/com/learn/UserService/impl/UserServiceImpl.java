package com.learn.UserService.impl;


import com.learn.UserService.Repository.UserRepository;
import com.learn.UserService.Service.UserService;
import com.learn.UserService.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User saveUser(User user) {
        String randomUserId= UUID.randomUUID().toString();
        user.setId(randomUserId);
        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    @Override
    public User getUser(String id) {
        return userRepository.findById(id).orElse(null);
    }

//    public User getUserByName(String name) {
//        return userRepository.findByName(name).get();
//    }

    @Override
    public void deleteUser(String id) {
        userRepository.delete(getUser(id));
    }

    public User updateUser(User user){
        User existingUser=userRepository.findById(user.getId()).orElse(null);
        existingUser.setName(user.getName());
        existingUser.setEmail(user.getEmail());
        existingUser.setAbout(user.getAbout());
        return userRepository.save(existingUser);
    }
}
