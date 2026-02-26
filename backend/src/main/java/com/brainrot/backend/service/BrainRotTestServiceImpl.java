package com.brainrot.backend.service;

import com.brainrot.dto.*;
import com.brainrot.model.*;
import com.brainrot.repository.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class BrainRotTestServiceImpl implements BrainRotTestService {

    private final BrainRotQuestionRepository questionRepository;
    private final BrainRotTestRepository testRepository;
    private final UserRepository userRepository;

    @Override
    public BrainRotTestResultDTO submitTest(BrainRotTestRequestDTO request) {

        User user = userRepository.findById(request.getUserId())
                .orElseThrow();

        int score = 0;

        for (AnswerDTO answerDTO : request.getAnswers()) {

            BrainRotQuestion question =
                    questionRepository.findById(answerDTO.getQuestionId())
                            .orElseThrow();

            boolean correct =
                    question.getCorrectAnswer()
                            .equals(answerDTO.getSelectedAnswer());

            if (correct) {
                score += question.getWeight();

                if (answerDTO.getResponseTimeMillis() < 3000)
                    score += 2; // speed bonus
            } else {
                score -= 1;
            }
        }

        String level = calculateLevel(score);

        BrainRotTest test = BrainRotTest.builder()
                .user(user)
                .totalScore(score)
                .rotLevel(level)
                .takenAt(LocalDateTime.now())
                .build();

        testRepository.save(test);

        return new BrainRotTestResultDTO(score, level);
    }

        private String calculateLevel(int score) {
        if (score < 10) return "LOW";
        if (score < 25) return "MEDIUM";
        if (score < 40) return "HIGH";
        return "CRITICAL";
    }
 
}
