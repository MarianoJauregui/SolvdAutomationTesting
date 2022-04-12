package apacheUtils;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;


public class NumberOfWords {
    private static final Logger LOGGER = LogManager.getLogger(NumberOfWords.class);

    public static void main(String[] args) {
        String text = "";
        try {
            text = FileUtils.readFileToString(new File("C:/Users/PC/IdeaProjects/Test/src/resources"));
        } catch (IOException e) {
            LOGGER.error(e);
        }
        //Number of unique words
        String[] words = text.split("-");
        HashMap<String, Integer> uniqueWord = new HashMap<>();
        for (String word: words){
            if(uniqueWord.containsKey(word)){
                uniqueWord.put(word, uniqueWord.get(word)+1);
            } else uniqueWord.put(word, 1);
        }
        try {
            FileUtils.writeStringToFile(new File("C:/Users/PC/IdeaProjects//Test/src/resources/uniqueWords.txt"),
                    "Unique words: " + uniqueWord.size() + "\n" + uniqueWord.toString());
        } catch (IOException e) {
            LOGGER.error(e);
        }
    }
}
