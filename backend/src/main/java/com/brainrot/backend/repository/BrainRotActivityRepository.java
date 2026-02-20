package com.brainrot.backend.repository;

import com.brainrot.backend.model.BrainRotActivity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BrainRotActivityRepository extends JpaRepository<BrainRotActivity,Long> {
}
