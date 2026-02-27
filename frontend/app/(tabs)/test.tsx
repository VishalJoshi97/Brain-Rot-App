import { View, Text } from 'react-native'
import React from 'react'

export default function test() {
  const [questions, setQuestions] = useState([]);
  const [currentIndex, setCurrentIndex] = useState(0);
  const [answers, setAnswers] = useState([]);
  const [loading, setLoading] = useState(true);
  const [startTime, setStartTime] = useState(null);
  const [result, setResult] = useState(null);

  useEffect(() => {
    loadQuestions();
  }, []);

  const loadQuestions = async () => {
    try {
      const res = await fetchQuestions();
      setQuestions(res.data);
      setStartTime(Date.now());
      setLoading(false);
    } catch (error) {
      console.log(error);
    }
  };
  return (
    <View>
      <Text>Test</Text>
    </View>
  )
}
