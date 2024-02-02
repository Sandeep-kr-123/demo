package com.shivani.expense_tracker.repository;

import com.shivani.expense_tracker.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,String> {
}
