package com.springboot.spring_boot_blog_app.repository;

import com.springboot.spring_boot_blog_app.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostRepository extends JpaRepository<Post,Long> {
    List<Post> findByCategoryId(Long categoryId);
}
