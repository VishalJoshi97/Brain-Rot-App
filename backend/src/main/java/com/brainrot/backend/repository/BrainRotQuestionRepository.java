package com.brainrot.backend.repository;

import com.brainrot.backend.model.BrainRotQuestion;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BrainRotQuestionRepository extends JpaRepository<BrainRotQuestion,Long> {
    @Override
    List<BrainRotQuestion> findAll();
}
