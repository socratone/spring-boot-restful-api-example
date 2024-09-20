package com.socratone.spring_boot_restful_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.socratone.spring_boot_restful_api.model.User;

// User 저장소
public interface UserRepository extends JpaRepository<User, Integer> {
}
