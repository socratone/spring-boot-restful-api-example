package com.socratone.spring_boot_restful_api;

import org.springframework.data.jpa.repository.JpaRepository;

// User 저장소
public interface UserRepository extends JpaRepository<User, Integer> {
}
