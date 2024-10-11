package wordpuzzle;

public class OutputView {

    private OutputView() {}

    public static void printGameStart(String word) {
        System.out.println("단어 퍼즐 게임을 시작합니다." + System.lineSeparator());
        System.out.printf("제시 단어: \"%s\"" + System.lineSeparator(), word);
    }

    public static void printGameWin() {
        System.out.println("정답입니다. 축하합니다." + System.lineSeparator());
    }

    public static void printNotCorrect() {
        System.out.println("정답이 아닙니다." + System.lineSeparator());
    }
}
