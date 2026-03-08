import React, { useEffect, useState } from "react";
import { View, FlatList } from "react-native";
import axios from "axios";
import MemeCard from "../components/MemeCard";

export default function ProfileScreen() {

  const [memes, setMemes] = useState([]);

  useEffect(() => {

    axios
      .get("http://YOUR_IP:8080/api/memes/user/1")
      .then(res => setMemes(res.data));

  }, []);

  return (

    <View style={{ flex: 1 }}>

      <FlatList
        data={memes}
        keyExtractor={(item:any) => item.id.toString()}
        renderItem={({ item }) => (
          <MemeCard meme={item} />
        )}
      />

    </View>

  );

}
