package com.socratone.spring_boot_restful_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.socratone.spring_boot_restful_api.model.Post;

// Post 저장소
public interface PostRepository extends JpaRepository<Post, Integer> {
}
