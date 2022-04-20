package apacheUtils;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


public class NumberOfWords {
    private static final Logger LOGGER = LogManager.getLogger(NumberOfWords.class);

    public static void main(String[] args) {
        String text = "";
        try {
            text = FileUtils.readFileToString(new File("C:/Users/PC/IdeaProjects/Test/src/resources/SolvdText.txt"));
        } catch (IOException e) {
            LOGGER.error(e);
        }

        //Number of unique words
        String[] words = text.split("-");
        Set<String> uniqueWord = new HashSet<>(Arrays.asList(words));
        System.out.println("Number of unique words: " +uniqueWord.size());

        //We create the file to count the words in the article
        try {
            FileUtils.writeStringToFile(new File(
                    "C:/Users/PC/IdeaProjects//Test/src/resources/uniqueWords.txt"),
                    uniqueWord.size() + " \n " +uniqueWord.size());
        } catch (IOException e) {
            LOGGER.error(e);
        }
    }
}
