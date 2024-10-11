package wordpuzzle;

public class Word {

    private final String word;

    public Word(String word) {
        this.word = word;
    }

    public boolean isCorrect(String c) {
        return word.equals(c);
    }

    public String shuffle() {
        return WordShuffler.shuffle(word);
    }
}
