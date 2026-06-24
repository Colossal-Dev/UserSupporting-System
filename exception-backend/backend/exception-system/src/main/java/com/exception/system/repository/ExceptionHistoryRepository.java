package com.exception.system.repository;

import com.exception.system.entity.ExceptionHistory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ExceptionHistoryRepository extends JpaRepository<ExceptionHistory, Long> {

    List<ExceptionHistory> findByExceptionId(Long exceptionId);

    List<ExceptionHistory> findTop5ByOrderByTimestampDesc();

    List<ExceptionHistory> findTop5ByExceptionIdInOrderByTimestampDesc(List<Long> exceptionIds);


}