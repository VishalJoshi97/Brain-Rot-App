import React, { useEffect, useState } from "react";
import { View, FlatList } from "react-native";
import axios from "axios";
import MemeCard from "../components/MemeCard";

export default function MemeFeedScreen() {

  const [memes, setMemes] = useState<any[]>([]);
  const [page, setPage] = useState(0);

  useEffect(() => {
    loadMemes();
  }, []);

  const loadMemes = async () => {

    const res = await axios.get(
      `http://YOUR_IP:8080/api/memes?page=${page}&size=10`
    );

    setMemes([...memes, ...res.data.content]);
    setPage(page + 1);
  };

  return (
    <View style={{ flex: 1, backgroundColor: "#121212" }}>

      <FlatList
        data={memes}
        keyExtractor={(item) => item.id.toString()}
        renderItem={({ item }) => (
          <MemeCard meme={item} />
        )}
        onEndReached={loadMemes}
        onEndReachedThreshold={0.5}
      />

    </View>
  );
}
