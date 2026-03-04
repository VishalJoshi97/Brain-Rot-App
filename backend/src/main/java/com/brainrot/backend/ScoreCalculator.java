package com.brainrot.backend.util;

public class ScoreCalculator {

    public static int calculateScore(boolean correct, long time) {

        int score = 0;

        if (correct) {
            score += 5;

            if (time < 3000)
                score += 3;
        } else {
            score -= 1;
        }

        return score;
    }

}
