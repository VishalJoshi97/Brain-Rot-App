import React from "react";
import { View, ActivityIndicator, StyleSheet } from "react-native";

const LoadingSpinner: React.FC = () => {
  return (
    <View style={styles.container}>
      <ActivityIndicator size="large" color="#00ff99" />
    </View>
  );
};

export default LoadingSpinner;

const styles = StyleSheet.create({
  container: {
    marginVertical: 20,
  },
});
