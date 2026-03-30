import { useState } from "react";
import API from "../services/api";

export const usePost = () => {
  const [loading, setLoading] = useState(false);
  const [error, setError] = useState<any>(null);

  const postData = async (url: string, body: any) => {
    setLoading(true);
    try {
      const res = await API.post(url, body);
      return res.data;
    } catch (err) {
      setError(err);
      throw err;
    } finally {
      setLoading(false);
    }
  };

  return { postData, loading, error };
};
