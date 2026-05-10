import java.util.*;

public class FrequencyCounter {
    public static void main(String[] args) {
        String sentence = "java is easy and java is powerful";
        String[] words = sentence.split("\\s+");
        Set<String> uniqueWords = new HashSet<>(Arrays.asList(words));
        Map<String, Integer> frequencyMap = new HashMap<>();

        for (String word : uniqueWords) {
            int count = 0;
            for (String w : words) {
                if (word.equals(w)) {
                    count++;
                }
            }
            frequencyMap.put(word, count);
        }

        for (Map.Entry<String, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
