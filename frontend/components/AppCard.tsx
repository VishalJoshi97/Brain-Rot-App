import React, { ReactNode } from "react";
import { View, StyleSheet, ViewStyle } from "react-native";

interface AppCardProps {
  children: ReactNode;
  style?: ViewStyle;
}

const AppCard: React.FC<AppCardProps> = ({
  children,
  style,
}) => {
  return <View style={[styles.card, style]}>{children}</View>;
};

export default AppCard;

const styles = StyleSheet.create({
  card: {
    backgroundColor: "#1e1e1e",
    borderRadius: 16,
    padding: 16,
    marginVertical: 8,
  },
});
