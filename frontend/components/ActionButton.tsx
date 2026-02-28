import React from "react";
import { TouchableOpacity, Text, StyleSheet } from "react-native";

export default function ActionButton({ title, onPress }) {
  return (
    <TouchableOpacity style={styles.button} onPress={onPress}>
      <Text style={styles.text}>{title}</Text>
    </TouchableOpacity>
  );
}

const styles = StyleSheet.create({
  button: {
    backgroundColor: "#00ff99",
    padding: 15,
    borderRadius: 10,
    alignItems: "center",
    marginBottom: 20,
  },
  text: {
    fontWeight: "bold",
  },
});
