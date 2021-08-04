package com.godcoder.wehome.repository;


import com.godcoder.wehome.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
