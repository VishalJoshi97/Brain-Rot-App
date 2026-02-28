import React from "react";
import { View, Text, StyleSheet } from "react-native";

export default function ScoreCard({ score, level }) {
  return (
    <View style={styles.card}>
      <Text style={styles.title}>🧠 Brain Rot Score</Text>
      <Text style={styles.score}>{score}</Text>
      <Text style={styles.level}>Level: {level}</Text>
    </View>
  );
}
