import { useState } from "react";

export const useBrainRotTest = () => {
  const [answers, setAnswers] = useState<any[]>([]);

  const selectAnswer = (questionId: number, option: string) => {
    setAnswers((prev) => {
      const filtered = prev.filter(a => a.questionId !== questionId);
      return [...filtered, { questionId, selectedOption: option }];
    });
  };

  return {
    answers,
    selectAnswer
  };
};
