import React from "react";
import { View, Text, StyleSheet } from "react-native";

export default function ScoreCard({ score=1, level=4 }) {
  return (
    <View style={styles.card}>
      <Text style={styles.title}>🧠 Brain Rot Score</Text>
      <Text style={styles.score}>{score}</Text>
      <Text style={styles.level}>Level: {level}</Text>
    </View>
  );
}

const styles = StyleSheet.create({
  card: {
    backgroundColor: "#1e1e1e",
    padding: 20,
    borderRadius: 15,
    marginBottom: 20,
  },
  title: {
    color: "#aaa",
    marginBottom: 5,
  },
  score: {
    fontSize: 32,
    color: "#00ff99",
  },
  level: {
    color: "#fff",
  },
});
