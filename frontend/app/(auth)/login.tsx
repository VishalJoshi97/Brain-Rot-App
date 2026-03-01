import { View, Text } from 'react-native'
import React from 'react'
import { Link } from 'expo-router'

export default function login() {
  return (
    <View>
      <Text>login</Text>
      <Link href={"/(tabs)/home"}>Goto Home Screen</Link>
    </View>
  )
}