package wordpuzzle;

import java.util.Arrays;

public enum RestartCommand {

    YES("y"),
    NO("n")
    ;

    private final String command;

    RestartCommand(String command) {
        this.command = command;
    }

    public static RestartCommand from(String command) {
        return Arrays.stream(values())
                .filter(gameCommand -> gameCommand.command.equalsIgnoreCase(command))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("해당 명령어는 존재하지 않습니다."));
    }

    public boolean isRestart() {
        return this == YES;
    }
}
