package com.exception.system.repository;

import com.exception.system.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findByTicket_IdOrderByCreatedAtDesc(Long ticketId);
}