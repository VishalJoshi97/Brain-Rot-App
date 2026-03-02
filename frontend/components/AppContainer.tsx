import React, { ReactNode } from "react";
import { View, StyleSheet, SafeAreaView } from "react-native";

interface AppContainerProps {
  children: ReactNode;
}

const AppContainer: React.FC<AppContainerProps> = ({ children }) => {
  return (
    <SafeAreaView style={styles.safe}>
      <View style={styles.container}>{children}</View>
    </SafeAreaView>
  );
};

export default AppContainer;

const styles = StyleSheet.create({
  safe: {
    flex: 1,
    backgroundColor: "#121212",
  },
  container: {
    flex: 1,
    padding: 20,
  },
});
