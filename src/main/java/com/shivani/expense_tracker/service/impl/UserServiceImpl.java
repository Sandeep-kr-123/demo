package com.shivani.expense_tracker.service.impl;

import com.shivani.expense_tracker.model.User;
import com.shivani.expense_tracker.repository.UserRepository;
import com.shivani.expense_tracker.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User getUser(String userId) {
        return userRepository.findById(userId).get();
    }

    @Override
    public String createUser(User user) {
        userRepository.save(user);
        return "User Created..........!!!!";
    }

    @Override
    public String updateUser(User user) {
        userRepository.save(user);
        return "User Updated......!!!!!";
    }

    @Override
    public String deleteUser(String userId) {
        userRepository.deleteById(userId);
        return "Deleted....!";
    }
}
