package subway.domain.menu;

import java.util.Arrays;
import java.util.stream.Stream;

public enum MainMenus {
    MANAGE_STATION("1", "역 관리"),
    MANAGE_LINE("2", "노선 관리"),
    MANAGE_SECTION("3", "구간 관리"),
    PRINT_SECTIONS("4", "지하철 노선도 출력"),
    EXIT("Q", "종료");

    private static final String INVALID_COMMAND_ERROR_MESSAGE = "[ERROR] 선택할 수 없는 기능입니다.";

    private final String command;
    private final String message;

    MainMenus(String command, String message) {
        this.command = command;
        this.message = message;
    }

    public static void validateCommand(String input) {
        Stream<MainMenus> stream = Arrays.stream(values());
        boolean isMatch = stream.anyMatch(value -> value.command.equals(input));
        if (!isMatch) {
            throw new IllegalArgumentException(INVALID_COMMAND_ERROR_MESSAGE);
        }
    }

    @Override
    public String toString() {
        return command + ". " + message + "\n";
    }

    public static String printMainMenus() {
        StringBuilder stringBuilder = new StringBuilder();

        Arrays.stream(values())
                .forEach(value -> stringBuilder.append(value.toString()));

        return stringBuilder.toString();
    }
}
