import { useMemo } from "react";

export const useScoreCalculator = (
  answers: any[],
  questions: any[]
) => {
  const score = useMemo(() => {
    let total = 0;

    answers.forEach((ans) => {
      const question = questions.find(q => q.id === ans.questionId);

      if (question && question.correctOption === ans.selectedOption) {
        total += question.points || 1;
      }
    });

    return total;
  }, [answers, questions]);

  return score;
};
