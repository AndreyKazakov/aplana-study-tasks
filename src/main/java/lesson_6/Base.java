package lesson_6;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Base {

    public static void main(String[] args) {

        TextAnalyzer program = new TextAnalyzer();

        List<String> list = program.readWordsFromFileToList("src\\main\\resources\\example_text.txt");
        Collections.sort(list); //sorting list in alphabet order
        System.out.println("Words from the original file sorted in alphabet order:\n" + list + "\n");

        Map<String, Integer> wordsWithApearancesCounts = program.findCountOfEachWordInList(list);
        System.out.println("Statistic for each word count:\n" + wordsWithApearancesCounts + "\n");

        Set<String> mostOftenWords = program.findWordsWithMaxApearancesCounts(wordsWithApearancesCounts).keySet();
        Integer apearancesCount = Collections.max(program.findWordsWithMaxApearancesCounts(wordsWithApearancesCounts).values());
        System.out.println("The most often word(s) with number of appearances " + apearancesCount + ": " + mostOftenWords);
    }

}
