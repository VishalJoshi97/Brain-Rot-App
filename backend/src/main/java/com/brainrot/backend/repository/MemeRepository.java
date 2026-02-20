package com.brainrot.backend.repository;

import com.brainrot.backend.model.Meme;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MemeRepository extends JpaRepository<Meme,Long> {

    List<Meme> findAllByOrderByLikesDesc();
}
