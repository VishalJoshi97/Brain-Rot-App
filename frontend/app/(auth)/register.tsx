import { View, Text } from 'react-native'
import React from 'react'
import { Link } from 'expo-router'

export default function register() {
  return (
    <View>
      <Text>register</Text>
      <Link href={"/(auth)/login"}>Goto Login</Link>
    </View>
  )
}