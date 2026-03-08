import React, { useState, useEffect } from "react";
import { View, FlatList, TextInput, Button } from "react-native";
import axios from "axios";

export default function MemeCommentsScreen({ route }) {

  const { memeId } = route.params;

  const [comments, setComments] = useState([]);
  const [text, setText] = useState("");

  const loadComments = async () => {

    const res = await axios.get(
      `http://YOUR_IP:8080/api/comments/${memeId}`
    );

    setComments(res.data);

  };

  useEffect(() => {
    loadComments();
  }, []);

  const postComment = async () => {

    await axios.post(
      `http://YOUR_IP:8080/api/comments`,
      {
        memeId,
        text
      }
    );

    setText("");
    loadComments();

  };

  return (

    <View style={{ flex: 1, padding: 20 }}>

      <FlatList
        data={comments}
        keyExtractor={(item:any) => item.id.toString()}
        renderItem={({ item }) => (
          <Text>{item.text}</Text>
        )}
      />

      <TextInput
        placeholder="Write comment"
        value={text}
        onChangeText={setText}
      />

      <Button title="Send" onPress={postComment} />

    </View>

  );

}
