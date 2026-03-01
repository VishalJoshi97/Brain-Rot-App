import { Tabs } from 'expo-router';
import React from 'react';

export default function TabLayout() {
 
  return (
    <Tabs
      screenOptions={{
        headerShown: false,
      }}>
      <Tabs.Screen
        name="home"
        options={{
          title: 'Home',
        }}
      />
      <Tabs.Screen
        name="post"
        options={{
          title: 'Post',
        }}
      />
      <Tabs.Screen
        name="test"
        options={{
          title: 'Test',
        }}
      />
      <Tabs.Screen
        name="profile"
        options={{
          title: 'Profile',
        }}
      />
    </Tabs>
  );
}
