package com.example.BookInventoryManagement.Persistence;

import com.example.BookInventoryManagement.Business.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
    
}
