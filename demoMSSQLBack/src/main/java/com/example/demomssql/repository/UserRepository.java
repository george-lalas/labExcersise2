package com.example.demomssql.repository;

import com.example.demomssql.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
