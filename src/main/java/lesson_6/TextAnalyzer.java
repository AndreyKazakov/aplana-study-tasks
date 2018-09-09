package lesson_6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class TextAnalyzer {
    /**
     * reads words from specified file and puts them into ArrayList
     *
     * @param filePath - is a String value of a path to file
     * @return List of Strings - all words from file without dots, commas, etc. and moved to LowerCase
     */
    protected List<String> readWordsFromFileToList(String filePath) {
        File file = new File(filePath);
        List<String> list = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                list.add(scanner.next().trim().replaceAll("\\s*([,,.,;,:,!,?,(,)])\\s*", "").toLowerCase());
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
            e.printStackTrace();
        }
        return list;
    }

    /**
     * calculates count of each word in the list and put pairs (word - count) into a Map
     *
     * @param list - list of Strings
     * @return Map of pairs String, Integer
     */
    protected Map<String, Integer> findCountOfEachWordInList(List<String> list) {
        Map<String, Integer> wordsMap = new TreeMap<>(); //using TreeMap because it provides sorting
        for (String s : list) {
            Integer count = wordsMap.get(s);
            if (count == null) {
                count = 0;
            }
            wordsMap.put(s, ++count);
        }
        return wordsMap;
    }

    /**
     * detects those pairs (Key-Value) in specified Map where the Value is maximal and put found pairs to a new Map
     * @param wordsMap - initial Map of pairs <String, Integer>
     * @return Map of pairs <String, Integer> where the Value is maximal
     */
    protected Map<String, Integer> findWordsWithMaxApearancesCounts(Map<String, Integer> wordsMap) {
        Integer maxValue = Collections.max(wordsMap.values());
        Map<String, Integer> maxWordsMap = new TreeMap<>();
        for (Map.Entry<String, Integer> entry : wordsMap.entrySet()) {
            if (entry.getValue().equals(maxValue)) {
                maxWordsMap.put(entry.getKey(), entry.getValue());
            }
        }
        return maxWordsMap;
    }
}
