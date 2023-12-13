package subway.view;

import subway.domain.menu.MainMenus;
import subway.domain.menu.StationManageMenus;

import java.util.Scanner;

public class InputView {
    private static final String INPUT_MENU_MESSAGE = "## 원하는 기능을 선택하세요.";

    static final Scanner scanner = new Scanner(System.in);

    private InputView() {
    }

    public static String inputMainMenu() {
        String input = null;

        try {
            System.out.println(INPUT_MENU_MESSAGE);
            input = scanner.nextLine();
            MainMenus.validateCommand(input);
        } catch (IllegalArgumentException e) {
            System.out.println("\n" + e.getMessage() + "\n");
            inputMainMenu();
        }

        return input;
    }

    public static String inputStationManageMenu() {
        String input = null;

        try {
            System.out.println(INPUT_MENU_MESSAGE);
            input = scanner.nextLine();
            StationManageMenus.validateCommand(input);
        } catch (IllegalArgumentException e) {
            System.out.println("\n" + e.getMessage() + "\n");
            inputStationManageMenu();
        }

        return input;
    }
}
