package com.brainrot.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BrainRotTestRepository extends JpaRepository<BrainRotTestRepository,Long> {
    List<BrainRotTestRepository> findTestByuserId(Long userId);
}
