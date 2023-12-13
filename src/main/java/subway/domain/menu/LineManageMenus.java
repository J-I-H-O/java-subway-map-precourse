package subway.domain.menu;

import java.util.Arrays;
import java.util.stream.Stream;

public enum LineManageMenus {
    ADD_LINE("1", "노선 등록"),
    REMOVE_LINE("2", "노선 삭제"),
    PRINT_LINES("3", "노선 조회"),
    MOVE_BACK("B", "돌아가기");

    private static final String INVALID_COMMAND_ERROR_MESSAGE = "[ERROR] 선택할 수 없는 기능입니다.";

    private final String command;
    private final String message;

    LineManageMenus(String command, String message) {
        this.command = command;
        this.message = message;
    }

    public static void validateCommand(String input) {
        Stream<LineManageMenus> stream = Arrays.stream(values());
        boolean isMatch = stream.anyMatch(value -> value.command.equals(input));
        if (!isMatch) {
            throw new IllegalArgumentException(INVALID_COMMAND_ERROR_MESSAGE);
        }
    }

    @Override
    public String toString() {
        return command + ". " + message + "\n";
    }

    public static String printMenus() {
        StringBuilder stringBuilder = new StringBuilder();

        Arrays.stream(values())
                .forEach(value -> stringBuilder.append(value.toString()));

        return stringBuilder.toString();
    }

    public String getCommand() {
        return command;
    }
}
