import React from "react";
import {
  TouchableOpacity,
  Text,
  StyleSheet,
  GestureResponderEvent,
} from "react-native";

interface AppButtonProps {
  title: string;
  onPress: (event: GestureResponderEvent) => void;
  variant?: "primary" | "secondary";
}

const AppButton: React.FC<AppButtonProps> = ({
  title,
  onPress,
  variant = "primary",
}) => {
  return (
    <TouchableOpacity
      style={[
        styles.button,
        variant === "secondary" && styles.secondary,
      ]}
      onPress={onPress}
    >
      <Text
        style={[
          styles.text,
          variant === "secondary" && styles.secondaryText,
        ]}
      >
        {title}
      </Text>
    </TouchableOpacity>
  );
};

export default AppButton;

const styles = StyleSheet.create({
  button: {
    backgroundColor: "#00ff99",
    padding: 15,
    borderRadius: 12,
    alignItems: "center",
    marginVertical: 8,
  },
  text: {
    fontWeight: "bold",
  },
  secondary: {
    backgroundColor: "#1e1e1e",
  },
  secondaryText: {
    color: "#fff",
  },
});
