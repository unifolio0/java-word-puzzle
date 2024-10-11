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
        System.out.println(word.getWord());
        OutputView.printGameStart(word.shuffle());
        return word;
    }

    private void play(Word word) {
        Step step = Step.startStep();
        while (step.isPlay()) {
            String s = InputView.inputClient();
            if (word.isCorrect(s)) {
                OutputView.printGameWin();
                break;
            }
            step = step.nextStep();
            OutputView.printNotCorrect();
        }
    }

    private boolean isRestart() {
        RestartCommand restartCommand = InputView.inputRestart();
        return restartCommand.isRestart();
    }
}
