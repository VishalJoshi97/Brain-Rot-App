import React from "react";
import { View, Text, StyleSheet } from "react-native";

interface AppHeaderProps {
  title: string;
  subtitle?: string;
}

const AppHeader: React.FC<AppHeaderProps> = ({
  title,
  subtitle,
}) => {
  return (
    <View style={styles.container}>
      <Text style={styles.title}>{title}</Text>
      {subtitle && (
        <Text style={styles.subtitle}>{subtitle}</Text>
      )}
    </View>
  );
};

export default AppHeader;

const styles = StyleSheet.create({
  container: {
    marginBottom: 20,
  },
  title: {
    fontSize: 24,
    fontWeight: "bold",
    color: "#fff",
  },
  subtitle: {
    color: "#aaa",
    marginTop: 4,
  },
});
