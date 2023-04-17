package com.example.demo.repository;

import com.example.demo.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment, Long> {

    List<Comment> findByTutorialId(Long postId);

    @Transactional(rollbackFor = {Exception.class, Throwable.class})
    void deleteByTutorialId(long tutorialId);
}
