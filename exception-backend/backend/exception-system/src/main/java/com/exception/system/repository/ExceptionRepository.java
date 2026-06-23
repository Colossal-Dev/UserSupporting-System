package com.exception.system.repository;

import com.exception.system.entity.ExceptionTicket;
import com.exception.system.entity.Status;
import com.exception.system.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ExceptionRepository extends JpaRepository<ExceptionTicket, Long> {

    List<ExceptionTicket> findByStatus(Status status);

    List<ExceptionTicket> findByPriority(String priority);

    List<ExceptionTicket> findByStatusAndPriority(Status status, String priority);

    List<ExceptionTicket> findByTitleContainingIgnoreCase(String keyword);

    List<ExceptionTicket> findByCreatedBy(User createdBy);

    List<ExceptionTicket> findByAssignedTo(User assignedTo);

    Page<ExceptionTicket> findAll(Pageable pageable);

    @Query("SELECT e.status, COUNT(e) FROM ExceptionTicket e GROUP BY e.status")
    List<Object[]> countByStatus();
    long countByAssignedToAndStatusIn(
            User assignedTo,
            List<Status> statuses
    );
}