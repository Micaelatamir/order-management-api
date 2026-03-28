package com.micaela.ordermanagementapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.micaela.ordermanagementapi.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}