import React, { ReactNode } from "react";
import { Text, TextStyle } from "react-native";

interface AppTextProps {
  children: ReactNode;
  size?: number;
  weight?: TextStyle["fontWeight"];
  color?: string;
  style?: TextStyle;
}

const AppText: React.FC<AppTextProps> = ({
  children,
  size = 16,
  weight = "normal",
  color = "#fff",
  style,
}) => {
  return (
    <Text
      style={[
        { fontSize: size, fontWeight: weight, color },
        style,
      ]}
    >
      {children}
    </Text>
  );
};

export default AppText;
