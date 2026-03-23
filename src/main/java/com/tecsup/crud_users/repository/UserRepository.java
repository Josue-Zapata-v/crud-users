package com.tecsup.crud_users.repository;

import com.tecsup.crud_users.model.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}