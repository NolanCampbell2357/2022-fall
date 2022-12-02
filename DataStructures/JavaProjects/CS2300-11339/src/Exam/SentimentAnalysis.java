package Exam;

import java.util.HashMap;

public class SentimentAnalysis {
    static double getSentimentScore(String sentence, HashMap<String, Double> wScores) {
        // ADD YOUR CODE HERE to
        // return the sum of the scores

        // Split the sentence into array of strings. eg) "It is great" -> ["It", "is", "great"]
        // For each word in the sentence
        //      If the word exists in wScores as a key, then add the score of the word

        String[] words =  sentence.split(" ");

        double score = 0;
        for(String word : words) {
            if(wScores.containsKey(word)) {
                score+=wScores.get(word);
            } 
        }

        return score;
    }
    public static void main(String[] args) {
        String[] word_score_strings = {"amazing 4.0", "incredible 4.5", "great 3.1", "bad -2.3"};
        HashMap<String, Double> wScores = new HashMap<String, Double>();

        // ADD YOUR CODE HERE to
        // build a HashMap 'wScores' from the list of string 'word_score_strings'

        // For each string in word_score_strings,
        //      Split the string. eg) "amazing 4.0" -> ["amazing", "4.0"].
        //      Convert string score to double score. eg) "4.0" -> 4.0. Double.parseDouble() will do.
        //      Add an entry (word, score) to wScores. For example ("amazing", 4.0)

        for(String str : word_score_strings) {
           String[] sepStr = str.split(" ");

           wScores.put(sepStr[0], Double.parseDouble(sepStr[1]));
        }

        System.out.println(wScores); // {amazing=4.0, bad=-2.3, incredible=4.5, good=2.3, great=3.1}
        System.out.println(getSentimentScore("It is great", wScores)); // 3.1
        System.out.println(getSentimentScore("This is amazing and incredible", wScores)); // 8.5
        System.out.println(getSentimentScore("Well so bad", wScores)); // -2.3

        // Suppose
        // that there are N words in the sentence and
        // that there are M (word,score) entry in wScores HashMap.
        // What is the time complexity of the function getSentimentScore()?
        // Give your answer here in comments
        // T(N,M) = O(N)
    }
}