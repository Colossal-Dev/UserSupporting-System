package com.exception.system.repository;

import com.exception.system.entity.FileAttachment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FileRepository extends JpaRepository<FileAttachment, Long> {
    List<FileAttachment> findByTicket_Id(Long ticketId);
}