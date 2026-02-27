import React, { useEffect, useState } from "react";
import {
  View,
  Text,
  TouchableOpacity,
  StyleSheet,
  ActivityIndicator,
} from "react-native";
import { fetchQuestions, submitTest } from "../services/api";

export default function test() {
  const [questions, setQuestions] = useState([]);
  const [currentIndex, setCurrentIndex] = useState(0);
  const [answers, setAnswers] = useState([]);
  const [loading, setLoading] = useState(true);
  const [startTime, setStartTime] = useState(null);
  const [result, setResult] = useState(null);

  useEffect(() => {
    loadQuestions();
  }, []);

  const loadQuestions = async () => {
    try {
      const res = await fetchQuestions();
      setQuestions(res.data);
      setStartTime(Date.now());
      setLoading(false);
    } catch (error) {
      console.log(error);
    }
  };

  const handleAnswer = (selectedOption) => {
    const endTime = Date.now();
    const responseTime = endTime - startTime;

    const currentQuestion = questions[currentIndex];

    setAnswers([
      ...answers,
      {
        questionId: currentQuestion.id,
        selectedAnswer: selectedOption,
        responseTimeMillis: responseTime,
      },
    ]);

    if (currentIndex + 1 < questions.length) {
      setCurrentIndex(currentIndex + 1);
      setStartTime(Date.now());
    } else {
      finishTest();
    }
  };

  const finishTest = async () => {
    try {
      const payload = {
        userId: 1, // replace with logged-in user id
        answers: answers,
      };

      const res = await submitTest(payload);
      setResult(res.data);
    } catch (error) {
      console.log(error);
    }
  };

  if (loading) return <ActivityIndicator size="large" />;

  if (result) {
    return (
      <View style={styles.container}>
        <Text style={styles.resultTitle}>
          Brain Rot Score: {result.score}
        </Text>
        <Text style={styles.resultLevel}>
          Level: {result.rotLevel}
        </Text>
      </View>
    );
  }

  const question = questions[currentIndex];
  
  return (
    <View>
      <Text>Test</Text>
    </View>
  )
}
