package com.socratone.spring_boot_restful_api;

import org.springframework.data.jpa.repository.JpaRepository;

// Post 저장소
public interface PostRepository extends JpaRepository<Post, Integer> {
}
