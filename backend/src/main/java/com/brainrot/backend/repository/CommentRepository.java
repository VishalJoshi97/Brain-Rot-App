package com.brainrot.backend.modules.comment.repository;

import com.brainrot.modules.comment.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepository
        extends JpaRepository<Comment, Long> {

    List<Comment> findByMemeId(Long memeId);

}
