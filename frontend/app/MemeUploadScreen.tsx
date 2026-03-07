import React, { useState } from "react";
import { View, Button, Image } from "react-native";
import * as ImagePicker from "expo-image-picker";
import axios from "axios";

export default function MemeUploadScreen() {

  const [image, setImage] = useState<any>(null);

  const pickImage = async () => {

    const result = await ImagePicker.launchImageLibraryAsync({
      mediaTypes: ImagePicker.MediaTypeOptions.Images,
      quality: 1
    });

    if (!result.canceled) {
      setImage(result.assets[0].uri);
    }

  };

  const uploadMeme = async () => {

    const formData = new FormData();

    formData.append("title", "My Meme");

    formData.append("image", {
      uri: image,
      name: "meme.jpg",
      type: "image/jpeg"
    } as any);

    await axios.post(
      "http://YOUR_IP:8080/api/memes/upload",
      formData,
      {
        headers: {
          "Content-Type": "multipart/form-data"
        }
      }
    );

    alert("Meme Uploaded!");

  };

  return (

    <View>

      <Button title="Pick Meme Image" onPress={pickImage} />

      {image && (
        <Image
          source={{ uri: image }}
          style={{ width: 300, height: 300 }}
        />
      )}

      <Button title="Upload Meme" onPress={uploadMeme} />

    </View>

  );

}
