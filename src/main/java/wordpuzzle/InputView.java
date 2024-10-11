package wordpuzzle;

import java.util.Scanner;

public class InputView {

    private static final Scanner SCANNER = new Scanner(System.in);

    private InputView() {}

    public static RestartCommand inputRestart() {
        System.out.println("게임을 다시 시작하겠습니까? (예: y, 아니오: n)");
        return RestartCommand.from(SCANNER.next());
    }

    public static String inputClient() {
        System.out.print("정답: ");
        return SCANNER.next();
    }
}
