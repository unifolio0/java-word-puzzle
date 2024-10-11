package wordpuzzle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;

public class VocabulariesGenerator {

    private VocabulariesGenerator() {}

    public static List<Word> generate() {
        try (InputStream inputStream = VocabulariesGenerator.class.getClassLoader().getResourceAsStream("word.txt");
             BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream))) {
            return getWords(bufferedReader);
        } catch (IOException e) {
            throw new IllegalArgumentException(e);
        }
    }

    private static List<Word> getWords(BufferedReader bufferedReader) throws IOException {
        return bufferedReader.lines()
                .map(Word::new)
                .toList();
    }
}
