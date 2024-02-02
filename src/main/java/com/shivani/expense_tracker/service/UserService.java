package com.shivani.expense_tracker.service;

import com.shivani.expense_tracker.model.User;

public interface UserService {
    public User getUser(String userId);
    public String createUser(User user);
    public String updateUser(User user);
    public String deleteUser(String userId);
}
