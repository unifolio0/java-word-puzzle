package wordpuzzle;

import java.util.List;
import java.util.Random;

public class WordPuzzleGame {

    private static final List<Word> VOCABULARIES = VocabulariesGenerator.generate();

    public void start() {
        do {
            Word word = setting();
            play(word);
        } while (isRestart());
    }

    private Word setting() {
        Random random = new Random();
        Word word = VOCABULARIES.get(random.nextInt(VOCABULARIES.size()));
        OutputView.printGameStart(word.shuffle());
        return word;
    }

    private void play(Word word) {
        int step = 0;
        while (step < 3) {
            String s = InputView.inputClient();
            if (word.isCorrect(s)) {
                OutputView.printGameWin();
                break;
            }
            step++;
            OutputView.printNotCorrect();
        }
    }

    private boolean isRestart() {
        RestartCommand restartCommand = InputView.inputRestart();
        return restartCommand.isRestart();
    }
}
