import React from "react";
import {
  TextInput,
  StyleSheet,
  TextInputProps,
} from "react-native";

const AppInput: React.FC<TextInputProps> = (props) => {
  return (
    <TextInput
      placeholderTextColor="#888"
      style={styles.input}
      {...props}
    />
  );
};

export default AppInput;

const styles = StyleSheet.create({
  input: {
    backgroundColor: "#1e1e1e",
    padding: 14,
    borderRadius: 12,
    color: "#fff",
    marginVertical: 8,
  },
});
