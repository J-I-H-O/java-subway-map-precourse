package subway.view;

import subway.domain.menu.MainMenus;

import java.util.Scanner;

public class InputView {
    private static final String INPUT_MAIN_MENU_MESSAGE = "## 원하는 기능을 선택하세요.";

    static final Scanner scanner = new Scanner(System.in);

    private InputView() {
    }

    public static String inputMainMenu() {
        String input = null;

        try {
            System.out.println(INPUT_MAIN_MENU_MESSAGE);
            input = scanner.nextLine();
            MainMenus.validateCommand(input);
        } catch (IllegalArgumentException e) {
            System.out.println("\n" + e.getMessage() + "\n");
            inputMainMenu();
        }

        return input;
    }
}
