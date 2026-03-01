// import React, { useEffect, useState } from "react";
// import {
//   View,
//   Text,
//   TouchableOpacity,
//   StyleSheet,
//   ActivityIndicator,
// } from "react-native";
// // import { fetchQuestions, submitTest } from "../services/api";

// export default function Test() {
//   const [questions, setQuestions] = useState([]);
//   const [currentIndex, setCurrentIndex] = useState(0);
//   const [answers, setAnswers] = useState([]);
//   const [loading, setLoading] = useState(true);
//   const [startTime, setStartTime] = useState(8);
//   const [result, setResult] = useState(null);

//   useEffect(() => {
//     loadQuestions();
//   }, []);

//   const loadQuestions = async () => {
//     try {
//       const res = await fetchQuestions();
//       setQuestions(res.data);
//       setStartTime(Date.now());
//       setLoading(false);
//     } catch (error) {
//       console.log(error);
//     }
//   };

//   const handleAnswer = (selectedOption) => {
//     const endTime = Date.now();
//     const responseTime = endTime - startTime;

//     const currentQuestion = questions[currentIndex];

//     setAnswers([
//       ...answers,
//       {
//         questionId: currentQuestion.id,
//         selectedAnswer: selectedOption,
//         responseTimeMillis: responseTime,
//       },
//     ]);

//     if (currentIndex + 1 < questions.length) {
//       setCurrentIndex(currentIndex + 1);
//       setStartTime(Date.now());
//     } else {
//       finishTest();
//     }
//   };

//   const finishTest = async () => {
//     try {
//       const payload = {
//         userId: 1, // replace with logged-in user id
//         answers: answers,
//       };

//       const res = await submitTest(payload);
//       setResult(res.data);
//     } catch (error) {
//       console.log(error);
//     }
//   };

//   if (loading) return <ActivityIndicator size="large" />;

//   if (result) {
//     return (
//       <View style={styles.container}>
//         <Text style={styles.resultTitle}>
//           Brain Rot Score: {result.score}
//         </Text>
//         <Text style={styles.resultLevel}>
//           Level: {result.rotLevel}
//         </Text>
//       </View>
//     );
//   }

//   const question = questions[currentIndex];
  
// return (
//     <View style={styles.container}>
//       <Text style={styles.progress}>
//         Question {currentIndex + 1}/{questions.length}
//       </Text>

//       <Text style={styles.question}>
//         {question.questionText}
//       </Text>

//       {["A", "B", "C", "D"].map((option) => (
//         <TouchableOpacity
//           key={option}
//           style={styles.option}
//           onPress={() =>
//             handleAnswer(question[`option${option}`])
//           }
//         >
//           <Text style={styles.optionText}>
//             {question[`option${option}`]}
//           </Text>
//         </TouchableOpacity>
//       ))}
//     </View>
//   );
// }

// const styles = StyleSheet.create({
//   container: {
//     flex: 1,
//     backgroundColor: "#121212",
//     padding: 20,
//     justifyContent: "center",
//   },
//   progress: {
//     color: "#aaa",
//     marginBottom: 10,
//   },
//   question: {
//     color: "#fff",
//     fontSize: 20,
//     marginBottom: 20,
//   },
//   option: {
//     backgroundColor: "#1e1e1e",
//     padding: 15,
//     marginVertical: 8,
//     borderRadius: 10,
//   },
//   optionText: {
//     color: "#fff",
//   },
//   resultTitle: {
//     color: "#fff",
//     fontSize: 24,
//     marginBottom: 10,
//   },
//   resultLevel: {
//     color: "#00ff99",
//     fontSize: 20,
//   },
// });

import { View, Text } from 'react-native'
import React from 'react'
import ScoreCard from '@/components/ScoreCard'

const test = () => {
  return (
    <View>
      <Text>test</Text>
      <ScoreCard  />
    </View>
  )
}

export default test