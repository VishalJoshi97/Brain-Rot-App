import { useState } from "react";

export const useAuth = () => {
  const [user, setUser] = useState<any>(
    JSON.parse(localStorage.getItem("user") || "null")
  );

  const login = (userData: any) => {
    setUser(userData);
    localStorage.setItem("user", JSON.stringify(userData));
  };

  const logout = () => {
    setUser(null);
    localStorage.removeItem("user");
  };

  return { user, login, logout };
};
